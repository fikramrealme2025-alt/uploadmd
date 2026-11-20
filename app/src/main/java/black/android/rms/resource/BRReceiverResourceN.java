package black.android.rms.resource;

public class BRReceiverResourceN {
    public static ReceiverResourceNStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ReceiverResourceNStatic.class, null, false);
    }

    public static ReceiverResourceNStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ReceiverResourceNStatic.class, null, true);
    }

    public static ReceiverResourceNContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ReceiverResourceNContext.class, caller, false);
    }

    public static ReceiverResourceNContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ReceiverResourceNContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ReceiverResourceNContext.class);
    }
}
