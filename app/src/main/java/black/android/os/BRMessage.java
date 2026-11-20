package black.android.os;

public class BRMessage {
    public static MessageStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(MessageStatic.class, null, false);
    }

    public static MessageStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(MessageStatic.class, null, true);
    }

    public static MessageContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(MessageContext.class, caller, false);
    }

    public static MessageContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(MessageContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(MessageContext.class);
    }
}
