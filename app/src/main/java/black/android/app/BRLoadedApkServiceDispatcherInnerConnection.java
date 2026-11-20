package black.android.app;

public class BRLoadedApkServiceDispatcherInnerConnection {
    public static LoadedApkServiceDispatcherInnerConnectionStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkServiceDispatcherInnerConnectionStatic.class, null, false);
    }

    public static LoadedApkServiceDispatcherInnerConnectionStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkServiceDispatcherInnerConnectionStatic.class, null, true);
    }

    public static LoadedApkServiceDispatcherInnerConnectionContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkServiceDispatcherInnerConnectionContext.class, caller, false);
    }

    public static LoadedApkServiceDispatcherInnerConnectionContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkServiceDispatcherInnerConnectionContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(LoadedApkServiceDispatcherInnerConnectionContext.class);
    }
}
