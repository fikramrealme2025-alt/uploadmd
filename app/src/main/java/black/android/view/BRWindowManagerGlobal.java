package black.android.view;

public class BRWindowManagerGlobal {
    public static WindowManagerGlobalStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(WindowManagerGlobalStatic.class, null, false);
    }

    public static WindowManagerGlobalStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(WindowManagerGlobalStatic.class, null, true);
    }

    public static WindowManagerGlobalContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(WindowManagerGlobalContext.class, caller, false);
    }

    public static WindowManagerGlobalContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(WindowManagerGlobalContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(WindowManagerGlobalContext.class);
    }
}
