package black.android.location;

public class BRGpsStatusL {
    public static GpsStatusLStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(GpsStatusLStatic.class, null, false);
    }

    public static GpsStatusLStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(GpsStatusLStatic.class, null, true);
    }

    public static GpsStatusLContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(GpsStatusLContext.class, caller, false);
    }

    public static GpsStatusLContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(GpsStatusLContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(GpsStatusLContext.class);
    }
}
