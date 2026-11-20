package black.android.view;

public class BRIWindowManager {
    public static IWindowManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IWindowManagerStatic.class, null, false);
    }

    public static IWindowManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IWindowManagerStatic.class, null, true);
    }

    public static IWindowManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IWindowManagerContext.class, caller, false);
    }

    public static IWindowManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IWindowManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IWindowManagerContext.class);
    }
}
