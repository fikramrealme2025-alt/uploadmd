package black.android.app;

public class BRLoadedApkReceiverDispatcher {
    public static LoadedApkReceiverDispatcherStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkReceiverDispatcherStatic.class, null, false);
    }

    public static LoadedApkReceiverDispatcherStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkReceiverDispatcherStatic.class, null, true);
    }

    public static LoadedApkReceiverDispatcherContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkReceiverDispatcherContext.class, caller, false);
    }

    public static LoadedApkReceiverDispatcherContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkReceiverDispatcherContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(LoadedApkReceiverDispatcherContext.class);
    }
}
