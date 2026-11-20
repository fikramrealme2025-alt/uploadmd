package black.android.hardware.display;

public class BRDisplayManagerGlobal {
    public static DisplayManagerGlobalStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(DisplayManagerGlobalStatic.class, null, false);
    }

    public static DisplayManagerGlobalStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(DisplayManagerGlobalStatic.class, null, true);
    }

    public static DisplayManagerGlobalContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(DisplayManagerGlobalContext.class, caller, false);
    }

    public static DisplayManagerGlobalContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(DisplayManagerGlobalContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(DisplayManagerGlobalContext.class);
    }
}
