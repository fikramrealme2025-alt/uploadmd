package black.android.rms.resource;

public class BRReceiverResourceLP {
    public static ReceiverResourceLPStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ReceiverResourceLPStatic.class, null, false);
    }

    public static ReceiverResourceLPStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ReceiverResourceLPStatic.class, null, true);
    }

    public static ReceiverResourceLPContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ReceiverResourceLPContext.class, caller, false);
    }

    public static ReceiverResourceLPContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ReceiverResourceLPContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ReceiverResourceLPContext.class);
    }
}
