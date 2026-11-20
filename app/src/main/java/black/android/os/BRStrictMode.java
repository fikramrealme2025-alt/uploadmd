package black.android.os;

public class BRStrictMode {
    public static StrictModeStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(StrictModeStatic.class, null, false);
    }

    public static StrictModeStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(StrictModeStatic.class, null, true);
    }

    public static StrictModeContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(StrictModeContext.class, caller, false);
    }

    public static StrictModeContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(StrictModeContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(StrictModeContext.class);
    }
}
