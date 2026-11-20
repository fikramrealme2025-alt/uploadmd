package black.android.widget;

public class BRToast {
    public static ToastStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ToastStatic.class, null, false);
    }

    public static ToastStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ToastStatic.class, null, true);
    }

    public static ToastContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ToastContext.class, caller, false);
    }

    public static ToastContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ToastContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ToastContext.class);
    }
}
