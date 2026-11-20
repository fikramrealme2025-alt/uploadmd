package black.android.content;

public class BRBroadcastReceiver {
    public static BroadcastReceiverStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(BroadcastReceiverStatic.class, null, false);
    }

    public static BroadcastReceiverStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(BroadcastReceiverStatic.class, null, true);
    }

    public static BroadcastReceiverContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(BroadcastReceiverContext.class, caller, false);
    }

    public static BroadcastReceiverContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(BroadcastReceiverContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(BroadcastReceiverContext.class);
    }
}
