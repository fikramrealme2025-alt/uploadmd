package black.android.location;

public class BRLocationManagerQ {
    public static LocationManagerQStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(LocationManagerQStatic.class, null, false);
    }

    public static LocationManagerQStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(LocationManagerQStatic.class, null, true);
    }

    public static LocationManagerQContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LocationManagerQContext.class, caller, false);
    }

    public static LocationManagerQContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LocationManagerQContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(LocationManagerQContext.class);
    }
}
