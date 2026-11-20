package black.android.app;

public class BRAppOpsManager {
    public static AppOpsManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(AppOpsManagerStatic.class, null, false);
    }

    public static AppOpsManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(AppOpsManagerStatic.class, null, true);
    }

    public static AppOpsManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(AppOpsManagerContext.class, caller, false);
    }

    public static AppOpsManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(AppOpsManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(AppOpsManagerContext.class);
    }
}
