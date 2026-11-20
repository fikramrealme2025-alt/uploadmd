package black.android.location;

public class BRLocationManagerListenerTransport {
    public static LocationManagerListenerTransportStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(LocationManagerListenerTransportStatic.class, null, false);
    }

    public static LocationManagerListenerTransportStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(LocationManagerListenerTransportStatic.class, null, true);
    }

    public static LocationManagerListenerTransportContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LocationManagerListenerTransportContext.class, caller, false);
    }

    public static LocationManagerListenerTransportContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LocationManagerListenerTransportContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(LocationManagerListenerTransportContext.class);
    }
}
