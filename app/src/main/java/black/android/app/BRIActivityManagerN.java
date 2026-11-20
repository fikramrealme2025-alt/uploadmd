package black.android.app;

public class BRIActivityManagerN {
    public static IActivityManagerNStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityManagerNStatic.class, null, false);
    }

    public static IActivityManagerNStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityManagerNStatic.class, null, true);
    }

    public static IActivityManagerNContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityManagerNContext.class, caller, false);
    }

    public static IActivityManagerNContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityManagerNContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IActivityManagerNContext.class);
    }
}
