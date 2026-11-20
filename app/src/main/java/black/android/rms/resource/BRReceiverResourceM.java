package black.android.rms.resource;

public class BRReceiverResourceM {
    public static ReceiverResourceMStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ReceiverResourceMStatic.class, null, false);
    }

    public static ReceiverResourceMStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ReceiverResourceMStatic.class, null, true);
    }

    public static ReceiverResourceMContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ReceiverResourceMContext.class, caller, false);
    }

    public static ReceiverResourceMContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ReceiverResourceMContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ReceiverResourceMContext.class);
    }
}
