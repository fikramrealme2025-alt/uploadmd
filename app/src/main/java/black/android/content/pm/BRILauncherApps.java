package black.android.content.pm;

public class BRILauncherApps {
    public static ILauncherAppsStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ILauncherAppsStatic.class, null, false);
    }

    public static ILauncherAppsStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ILauncherAppsStatic.class, null, true);
    }

    public static ILauncherAppsContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ILauncherAppsContext.class, caller, false);
    }

    public static ILauncherAppsContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ILauncherAppsContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ILauncherAppsContext.class);
    }
}
