package black.com.android.internal;

public class BRRid {
    public static RidStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(RidStatic.class, null, false);
    }

    public static RidStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(RidStatic.class, null, true);
    }

    public static RidContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(RidContext.class, caller, false);
    }

    public static RidContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(RidContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(RidContext.class);
    }
}
