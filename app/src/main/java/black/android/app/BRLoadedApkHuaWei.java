package black.android.app;

public class BRLoadedApkHuaWei {
    public static LoadedApkHuaWeiStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkHuaWeiStatic.class, null, false);
    }

    public static LoadedApkHuaWeiStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkHuaWeiStatic.class, null, true);
    }

    public static LoadedApkHuaWeiContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkHuaWeiContext.class, caller, false);
    }

    public static LoadedApkHuaWeiContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkHuaWeiContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(LoadedApkHuaWeiContext.class);
    }
}
