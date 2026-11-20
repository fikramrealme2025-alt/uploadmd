package black.android.app;

public class BRLoadedApkICS {
    public static LoadedApkICSStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkICSStatic.class, null, false);
    }

    public static LoadedApkICSStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkICSStatic.class, null, true);
    }

    public static LoadedApkICSContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkICSContext.class, caller, false);
    }

    public static LoadedApkICSContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkICSContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(LoadedApkICSContext.class);
    }
}
