package black.android.rms.resource;

public class BRReceiverResourceO {
    public static ReceiverResourceOStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ReceiverResourceOStatic.class, null, false);
    }

    public static ReceiverResourceOStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ReceiverResourceOStatic.class, null, true);
    }

    public static ReceiverResourceOContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ReceiverResourceOContext.class, caller, false);
    }

    public static ReceiverResourceOContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ReceiverResourceOContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ReceiverResourceOContext.class);
    }
}
