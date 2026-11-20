package black.android.location;

public class BRLocationManagerGnssStatusListenerTransport {
    public static LocationManagerGnssStatusListenerTransportStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(LocationManagerGnssStatusListenerTransportStatic.class, null, false);
    }

    public static LocationManagerGnssStatusListenerTransportStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(LocationManagerGnssStatusListenerTransportStatic.class, null, true);
    }

    public static LocationManagerGnssStatusListenerTransportContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LocationManagerGnssStatusListenerTransportContext.class, caller, false);
    }

    public static LocationManagerGnssStatusListenerTransportContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LocationManagerGnssStatusListenerTransportContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(LocationManagerGnssStatusListenerTransportContext.class);
    }
}
