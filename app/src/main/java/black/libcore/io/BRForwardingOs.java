package black.libcore.io;

public class BRForwardingOs {
    public static ForwardingOsStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ForwardingOsStatic.class, null, false);
    }

    public static ForwardingOsStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ForwardingOsStatic.class, null, true);
    }

    public static ForwardingOsContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ForwardingOsContext.class, caller, false);
    }

    public static ForwardingOsContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ForwardingOsContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ForwardingOsContext.class);
    }
}
