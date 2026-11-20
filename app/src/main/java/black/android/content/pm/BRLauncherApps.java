package black.android.content.pm;

public class BRLauncherApps {
    public static LauncherAppsStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(LauncherAppsStatic.class, null, false);
    }

    public static LauncherAppsStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(LauncherAppsStatic.class, null, true);
    }

    public static LauncherAppsContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LauncherAppsContext.class, caller, false);
    }

    public static LauncherAppsContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LauncherAppsContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(LauncherAppsContext.class);
    }
}
