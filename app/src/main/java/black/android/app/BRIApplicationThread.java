package black.android.app;

public class BRIApplicationThread {
    public static IApplicationThreadStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IApplicationThreadStatic.class, null, false);
    }

    public static IApplicationThreadStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IApplicationThreadStatic.class, null, true);
    }

    public static IApplicationThreadContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IApplicationThreadContext.class, caller, false);
    }

    public static IApplicationThreadContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IApplicationThreadContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IApplicationThreadContext.class);
    }
}
