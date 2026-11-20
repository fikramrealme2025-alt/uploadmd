package black.com.android.internal.view;

public class BRIInputMethodManager {
    public static IInputMethodManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IInputMethodManagerStatic.class, null, false);
    }

    public static IInputMethodManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IInputMethodManagerStatic.class, null, true);
    }

    public static IInputMethodManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IInputMethodManagerContext.class, caller, false);
    }

    public static IInputMethodManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IInputMethodManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IInputMethodManagerContext.class);
    }
}
