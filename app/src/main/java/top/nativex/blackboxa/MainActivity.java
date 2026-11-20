package top.nativex.blackboxa;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.entity.pm.InstallResult;

/** UI minimal (Java murni, tanpa AppCompat): daftar app virtual, tambah dari HP / dari APK, buka, hentikan, hapus. */
public class MainActivity extends Activity {
    private static final int USER_ID = 0;
    private static final int REQ_PICK_APK = 1001;
    private static final int REQ_PERMS = 1002;

    private final Handler ui = new Handler(Looper.getMainLooper());
    private final List<ApplicationInfo> virtualApps = new ArrayList<ApplicationInfo>();
    private final List<String> rows = new ArrayList<String>();
    private ArrayAdapter<String> adapter;
    private TextView empty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buildUi();
        requestBasicPermissions();
        refresh();
    }

    @Override
    protected void onResume() {
        super.onResume();
        refresh();
    }

    private int dp(int v) {
        return (int) (v * getResources().getDisplayMetrics().density + 0.5f);
    }

    private Button button(String text, View.OnClickListener l) {
        Button b = new Button(this);
        b.setText(text);
        b.setAllCaps(false);
        b.setOnClickListener(l);
        b.setLayoutParams(new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));
        return b;
    }

    private void buildUi() {
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(dp(12), dp(24), dp(12), dp(12));

        TextView title = new TextView(this);
        title.setText("SUNGKRAM");
        title.setTextSize(22);
        root.addView(title);

        LinearLayout row1 = new LinearLayout(this);
        row1.addView(button("Tambah dari HP", new View.OnClickListener() {
            @Override public void onClick(View v) { showHostApps(); }
        }));
        row1.addView(button("Pilih APK", new View.OnClickListener() {
            @Override public void onClick(View v) { pickApk(); }
        }));
        root.addView(row1);

        LinearLayout row2 = new LinearLayout(this);
        row2.addView(button("Izin semua file", new View.OnClickListener() {
            @Override public void onClick(View v) { openAllFilesAccess(); }
        }));
        row2.addView(button("Izin overlay", new View.OnClickListener() {
            @Override public void onClick(View v) { openOverlayPermission(); }
        }));
        root.addView(row2);

        empty = new TextView(this);
        empty.setText("Belum ada app virtual.\nTambahkan Game Guardian dan game-nya ke sini.");
        empty.setPadding(0, dp(24), 0, 0);
        root.addView(empty);

        ListView list = new ListView(this);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, rows);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                launch(virtualApps.get(position).packageName);
            }
        });
        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                showAppMenu(virtualApps.get(position));
                return true;
            }
        });
        root.addView(list, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 0, 1f));
        setContentView(root);
    }

    private void requestBasicPermissions() {
        if (Build.VERSION.SDK_INT >= 23) {
            requestPermissions(new String[]{
                    "android.permission.READ_EXTERNAL_STORAGE",
                    "android.permission.WRITE_EXTERNAL_STORAGE"}, REQ_PERMS);
        }
    }

    private void openAllFilesAccess() {
        if (Build.VERSION.SDK_INT >= 30) {
            if (Environment.isExternalStorageManager()) {
                toast("Izin semua file sudah aktif");
                return;
            }
            try {
                startActivity(new Intent(Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION,
                        Uri.parse("package:" + getPackageName())));
            } catch (ActivityNotFoundException e) {
                startActivity(new Intent(Settings.ACTION_MANAGE_ALL_FILES_ACCESS_PERMISSION));
            }
        } else {
            requestBasicPermissions();
        }
    }

    private void openOverlayPermission() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (Settings.canDrawOverlays(this)) {
                toast("Izin overlay sudah aktif");
                return;
            }
            startActivity(new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                    Uri.parse("package:" + getPackageName())));
        }
    }

    private void toast(String s) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }

    private String labelOf(ApplicationInfo ai) {
        try {
            CharSequence l = BlackBoxCore.getPackageManager().getApplicationLabel(ai);
            if (l != null && l.length() > 0) return l.toString();
        } catch (Throwable ignored) {
        }
        return ai.packageName;
    }

    private void refresh() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                final List<ApplicationInfo> apps = new ArrayList<ApplicationInfo>();
                try {
                    List<ApplicationInfo> got = BlackBoxCore.get().getInstalledApplications(0, USER_ID);
                    if (got != null) apps.addAll(got);
                } catch (Throwable ignored) {
                }
                final List<String> labels = new ArrayList<String>();
                for (ApplicationInfo ai : apps) {
                    labels.add(labelOf(ai) + "\n" + ai.packageName);
                }
                ui.post(new Runnable() {
                    @Override
                    public void run() {
                        virtualApps.clear();
                        virtualApps.addAll(apps);
                        rows.clear();
                        rows.addAll(labels);
                        adapter.notifyDataSetChanged();
                        empty.setVisibility(virtualApps.isEmpty() ? View.VISIBLE : View.GONE);
                    }
                });
            }
        }).start();
    }

    private void showHostApps() {
        final PackageManager pm = getPackageManager();
        final List<ApplicationInfo> host = new ArrayList<ApplicationInfo>();
        for (ApplicationInfo ai : pm.getInstalledApplications(0)) {
            if ((ai.flags & ApplicationInfo.FLAG_SYSTEM) != 0) continue;
            if (ai.packageName.equals(getPackageName())) continue;
            host.add(ai);
        }
        Collections.sort(host, new Comparator<ApplicationInfo>() {
            @Override
            public int compare(ApplicationInfo a, ApplicationInfo b) {
                return a.loadLabel(pm).toString().compareToIgnoreCase(b.loadLabel(pm).toString());
            }
        });
        String[] names = new String[host.size()];
        for (int i = 0; i < names.length; i++) {
            names[i] = host.get(i).loadLabel(pm) + "\n" + host.get(i).packageName;
        }
        new AlertDialog.Builder(this)
                .setTitle("Pilih app untuk ditambahkan")
                .setItems(names, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface d, int which) {
                        installHostPackage(host.get(which).packageName);
                    }
                })
                .show();
    }

    private void installHostPackage(final String pkg) {
        toast("Memasang " + pkg + " ...");
        new Thread(new Runnable() {
            @Override
            public void run() {
                InstallResult r;
                try {
                    r = BlackBoxCore.get().installPackageAsUser(pkg, USER_ID);
                } catch (Throwable t) {
                    r = new InstallResult().installError(String.valueOf(t.getMessage()));
                }
                reportInstall(r);
            }
        }).start();
    }

    private void pickApk() {
        Intent i = new Intent(Intent.ACTION_GET_CONTENT);
        i.setType("*/*");
        i.addCategory(Intent.CATEGORY_OPENABLE);
        try {
            startActivityForResult(Intent.createChooser(i, "Pilih APK"), REQ_PICK_APK);
        } catch (ActivityNotFoundException e) {
            toast("Tidak ada file picker");
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != REQ_PICK_APK || resultCode != RESULT_OK || data == null || data.getData() == null) return;
        final Uri uri = data.getData();
        toast("Memasang APK ...");
        new Thread(new Runnable() {
            @Override
            public void run() {
                InstallResult r;
                try {
                    r = BlackBoxCore.get().installPackageAsUser(uri, USER_ID);
                } catch (Throwable t) {
                    r = new InstallResult().installError(String.valueOf(t.getMessage()));
                }
                reportInstall(r);
            }
        }).start();
    }

    private void reportInstall(final InstallResult r) {
        ui.post(new Runnable() {
            @Override
            public void run() {
                if (r != null && r.success) {
                    toast("Berhasil: " + r.packageName);
                } else {
                    toast("Gagal: " + (r == null ? "?" : r.msg));
                }
                refresh();
            }
        });
    }

    private void launch(String pkg) {
        try {
            if (!BlackBoxCore.get().launchApk(pkg, USER_ID)) {
                toast("Gagal membuka " + pkg);
            }
        } catch (Throwable t) {
            toast("Error: " + t.getMessage());
        }
    }

    private void showAppMenu(final ApplicationInfo ai) {
        new AlertDialog.Builder(this)
                .setTitle(labelOf(ai))
                .setItems(new String[]{"Buka", "Hentikan", "Hapus"}, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface d, int which) {
                        try {
                            if (which == 0) {
                                launch(ai.packageName);
                            } else if (which == 1) {
                                BlackBoxCore.get().stopPackage(ai.packageName, USER_ID);
                                toast("Dihentikan");
                            } else {
                                BlackBoxCore.get().uninstallPackageAsUser(ai.packageName, USER_ID);
                                refresh();
                            }
                        } catch (Throwable t) {
                            toast("Error: " + t.getMessage());
                        }
                    }
                })
                .show();
    }
}
