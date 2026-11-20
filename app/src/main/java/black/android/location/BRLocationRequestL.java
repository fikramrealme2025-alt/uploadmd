package black.android.location;

public class BRLocationRequestL {
    public static LocationRequestLStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(LocationRequestLStatic.class, null, false);
    }

    public static LocationRequestLStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(LocationRequestLStatic.class, null, true);
    }

    public static LocationRequestLContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LocationRequestLContext.class, caller, false);
    }

    public static LocationRequestLContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LocationRequestLContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(LocationRequestLContext.class);
    }
}
