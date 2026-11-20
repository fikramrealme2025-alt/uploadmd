package black.android.app;

public class BRIActivityManager {
    public static IActivityManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityManagerStatic.class, null, false);
    }

    public static IActivityManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityManagerStatic.class, null, true);
    }

    public static IActivityManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityManagerContext.class, caller, false);
    }

    public static IActivityManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IActivityManagerContext.class);
    }
}
