package black.android.location;

public class BRILocationManager {
    public static ILocationManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ILocationManagerStatic.class, null, false);
    }

    public static ILocationManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ILocationManagerStatic.class, null, true);
    }

    public static ILocationManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ILocationManagerContext.class, caller, false);
    }

    public static ILocationManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ILocationManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ILocationManagerContext.class);
    }
}
