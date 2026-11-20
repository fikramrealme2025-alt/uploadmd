package black.android.content;

public class BRBroadcastReceiverPendingResult {
    public static BroadcastReceiverPendingResultStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(BroadcastReceiverPendingResultStatic.class, null, false);
    }

    public static BroadcastReceiverPendingResultStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(BroadcastReceiverPendingResultStatic.class, null, true);
    }

    public static BroadcastReceiverPendingResultContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(BroadcastReceiverPendingResultContext.class, caller, false);
    }

    public static BroadcastReceiverPendingResultContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(BroadcastReceiverPendingResultContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(BroadcastReceiverPendingResultContext.class);
    }
}
