package black.android.app;

public class BRActivityManager {
    public static ActivityManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityManagerStatic.class, null, false);
    }

    public static ActivityManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityManagerStatic.class, null, true);
    }

    public static ActivityManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityManagerContext.class, caller, false);
    }

    public static ActivityManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ActivityManagerContext.class);
    }
}
