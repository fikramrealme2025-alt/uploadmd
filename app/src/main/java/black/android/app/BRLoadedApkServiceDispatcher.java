package black.android.app;

public class BRLoadedApkServiceDispatcher {
    public static LoadedApkServiceDispatcherStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkServiceDispatcherStatic.class, null, false);
    }

    public static LoadedApkServiceDispatcherStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkServiceDispatcherStatic.class, null, true);
    }

    public static LoadedApkServiceDispatcherContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkServiceDispatcherContext.class, caller, false);
    }

    public static LoadedApkServiceDispatcherContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkServiceDispatcherContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(LoadedApkServiceDispatcherContext.class);
    }
}
