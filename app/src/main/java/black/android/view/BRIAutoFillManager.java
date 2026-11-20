package black.android.view;

public class BRIAutoFillManager {
    public static IAutoFillManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAutoFillManagerStatic.class, null, false);
    }

    public static IAutoFillManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAutoFillManagerStatic.class, null, true);
    }

    public static IAutoFillManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAutoFillManagerContext.class, caller, false);
    }

    public static IAutoFillManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAutoFillManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IAutoFillManagerContext.class);
    }
}
