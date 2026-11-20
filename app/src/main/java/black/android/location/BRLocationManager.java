package black.android.location;

public class BRLocationManager {
    public static LocationManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(LocationManagerStatic.class, null, false);
    }

    public static LocationManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(LocationManagerStatic.class, null, true);
    }

    public static LocationManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LocationManagerContext.class, caller, false);
    }

    public static LocationManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LocationManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(LocationManagerContext.class);
    }
}
