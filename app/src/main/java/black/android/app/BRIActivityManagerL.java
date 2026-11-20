package black.android.app;

public class BRIActivityManagerL {
    public static IActivityManagerLStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityManagerLStatic.class, null, false);
    }

    public static IActivityManagerLStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityManagerLStatic.class, null, true);
    }

    public static IActivityManagerLContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityManagerLContext.class, caller, false);
    }

    public static IActivityManagerLContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityManagerLContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IActivityManagerLContext.class);
    }
}
