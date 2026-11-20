package black.android.hardware.display;

public class BRIDisplayManager {
    public static IDisplayManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IDisplayManagerStatic.class, null, false);
    }

    public static IDisplayManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IDisplayManagerStatic.class, null, true);
    }

    public static IDisplayManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IDisplayManagerContext.class, caller, false);
    }

    public static IDisplayManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IDisplayManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IDisplayManagerContext.class);
    }
}
