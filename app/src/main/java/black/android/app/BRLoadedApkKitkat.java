package black.android.app;

public class BRLoadedApkKitkat {
    public static LoadedApkKitkatStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkKitkatStatic.class, null, false);
    }

    public static LoadedApkKitkatStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkKitkatStatic.class, null, true);
    }

    public static LoadedApkKitkatContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkKitkatContext.class, caller, false);
    }

    public static LoadedApkKitkatContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkKitkatContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(LoadedApkKitkatContext.class);
    }
}
