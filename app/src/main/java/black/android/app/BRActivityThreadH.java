package black.android.app;

public class BRActivityThreadH {
    public static ActivityThreadHStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadHStatic.class, null, false);
    }

    public static ActivityThreadHStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadHStatic.class, null, true);
    }

    public static ActivityThreadHContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadHContext.class, caller, false);
    }

    public static ActivityThreadHContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadHContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ActivityThreadHContext.class);
    }
}
