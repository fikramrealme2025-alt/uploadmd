package black.android.app;

public class BRActivityThread {
    public static ActivityThreadStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadStatic.class, null, false);
    }

    public static ActivityThreadStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadStatic.class, null, true);
    }

    public static ActivityThreadContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadContext.class, caller, false);
    }

    public static ActivityThreadContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ActivityThreadContext.class);
    }
}
