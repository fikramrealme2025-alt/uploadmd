package black.android.content;

public class BRIIntentReceiver {
    public static IIntentReceiverStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IIntentReceiverStatic.class, null, false);
    }

    public static IIntentReceiverStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IIntentReceiverStatic.class, null, true);
    }

    public static IIntentReceiverContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IIntentReceiverContext.class, caller, false);
    }

    public static IIntentReceiverContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IIntentReceiverContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IIntentReceiverContext.class);
    }
}
