package black.com.android.internal.view.inputmethod;

public class BRInputMethodManager {
    public static InputMethodManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(InputMethodManagerStatic.class, null, false);
    }

    public static InputMethodManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(InputMethodManagerStatic.class, null, true);
    }

    public static InputMethodManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(InputMethodManagerContext.class, caller, false);
    }

    public static InputMethodManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(InputMethodManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(InputMethodManagerContext.class);
    }
}
