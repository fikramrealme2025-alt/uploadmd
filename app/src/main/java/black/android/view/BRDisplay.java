package black.android.view;

public class BRDisplay {
    public static DisplayStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(DisplayStatic.class, null, false);
    }

    public static DisplayStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(DisplayStatic.class, null, true);
    }

    public static DisplayContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(DisplayContext.class, caller, false);
    }

    public static DisplayContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(DisplayContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(DisplayContext.class);
    }
}
