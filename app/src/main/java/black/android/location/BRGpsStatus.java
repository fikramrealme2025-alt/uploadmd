package black.android.location;

public class BRGpsStatus {
    public static GpsStatusStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(GpsStatusStatic.class, null, false);
    }

    public static GpsStatusStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(GpsStatusStatic.class, null, true);
    }

    public static GpsStatusContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(GpsStatusContext.class, caller, false);
    }

    public static GpsStatusContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(GpsStatusContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(GpsStatusContext.class);
    }
}
