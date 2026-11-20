package black.android.app;

public class BRActivityThreadQ {
    public static ActivityThreadQStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadQStatic.class, null, false);
    }

    public static ActivityThreadQStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadQStatic.class, null, true);
    }

    public static ActivityThreadQContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadQContext.class, caller, false);
    }

    public static ActivityThreadQContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadQContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ActivityThreadQContext.class);
    }
}
