package black.android.location;

public class BRLocationManagerGpsStatusListenerTransport {
    public static LocationManagerGpsStatusListenerTransportStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(LocationManagerGpsStatusListenerTransportStatic.class, null, false);
    }

    public static LocationManagerGpsStatusListenerTransportStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(LocationManagerGpsStatusListenerTransportStatic.class, null, true);
    }

    public static LocationManagerGpsStatusListenerTransportContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LocationManagerGpsStatusListenerTransportContext.class, caller, false);
    }

    public static LocationManagerGpsStatusListenerTransportContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LocationManagerGpsStatusListenerTransportContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(LocationManagerGpsStatusListenerTransportContext.class);
    }
}
