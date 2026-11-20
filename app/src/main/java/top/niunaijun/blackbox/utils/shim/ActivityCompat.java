package top.niunaijun.blackbox.utils.shim;

import android.app.Activity;

public final class ActivityCompat {
    private ActivityCompat() {}

    public static void requestPermissions(Activity activity, String[] permissions, int requestCode) {
        activity.requestPermissions(permissions, requestCode);
    }

    public static boolean shouldShowRequestPermissionRationale(Activity activity, String permission) {
        return activity.shouldShowRequestPermissionRationale(permission);
    }
}
