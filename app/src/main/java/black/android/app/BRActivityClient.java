package black.android.app;

public class BRActivityClient {
    public static ActivityClientStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityClientStatic.class, null, false);
    }

    public static ActivityClientStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityClientStatic.class, null, true);
    }

    public static ActivityClientContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityClientContext.class, caller, false);
    }

    public static ActivityClientContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityClientContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ActivityClientContext.class);
    }
}
