package black.android.app;

public class BRLoadedApkReceiverDispatcherInnerReceiver {
    public static LoadedApkReceiverDispatcherInnerReceiverStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkReceiverDispatcherInnerReceiverStatic.class, null, false);
    }

    public static LoadedApkReceiverDispatcherInnerReceiverStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkReceiverDispatcherInnerReceiverStatic.class, null, true);
    }

    public static LoadedApkReceiverDispatcherInnerReceiverContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkReceiverDispatcherInnerReceiverContext.class, caller, false);
    }

    public static LoadedApkReceiverDispatcherInnerReceiverContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LoadedApkReceiverDispatcherInnerReceiverContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(LoadedApkReceiverDispatcherInnerReceiverContext.class);
    }
}
