package black.android.app;

public class BRLoadedApk {
    public static LoadedApkStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkStatic.class, null, false);
    }

    public static LoadedApkStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkStatic.class, null, true);
    }

    public static LoadedApkContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkContext.class, caller, false);
    }

    public static LoadedApkContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(LoadedApkContext.class);
    }
}
