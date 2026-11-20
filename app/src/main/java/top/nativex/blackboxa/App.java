package top.nativex.blackboxa;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.app.configuration.AppLifecycleCallback;
import top.niunaijun.blackbox.app.configuration.ClientConfiguration;

public class App extends Application {
    private static final String TAG = "App";
    private static Context sContext;

    public static Context getContext() {
        return sContext;
    }

    @Override
    protected void attachBaseContext(final Context base) {
        super.attachBaseContext(base);
        sContext = base;

        BlackBoxCore core = BlackBoxCore.get();
        try {
            core.closeCodeInit();
        } catch (Throwable e) {
            Log.e(TAG, "closeCodeInit: " + e.getMessage());
        }
        try {
            core.onBeforeMainApplicationAttach(this, base);
        } catch (Throwable e) {
            Log.e(TAG, "onBeforeMainApplicationAttach: " + e.getMessage());
        }
        try {
            core.doAttachBaseContext(base, new ClientConfiguration() {
                @Override
                public String getHostPackageName() {
                    return base.getPackageName();
                }

                @Override
                public boolean isEnableDaemonService() {
                    return false;
                }

                @Override
                public String getLogSenderChatId() {
                    return null; // upload log dimatikan
                }
            });
            core.addAppLifecycleCallback(new AppLifecycleCallback() {
                @Override
                public boolean onStoragePermissionNeeded(String packageName, int userId) {
                    return false; // tetap lanjut buka app (Game Guardian butuh akses storage)
                }
            });
        } catch (Throwable e) {
            Log.e(TAG, "doAttachBaseContext: " + e.getMessage());
        }
        try {
            core.onAfterMainApplicationAttach(this, base);
        } catch (Throwable e) {
            Log.e(TAG, "onAfterMainApplicationAttach: " + e.getMessage());
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        try {
            BlackBoxCore.get().doCreate();
        } catch (Throwable e) {
            Log.e(TAG, "doCreate: " + e.getMessage());
        }
    }
}
