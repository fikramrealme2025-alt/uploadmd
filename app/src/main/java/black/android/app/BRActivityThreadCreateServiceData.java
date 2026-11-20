package black.android.app;

public class BRActivityThreadCreateServiceData {
    public static ActivityThreadCreateServiceDataStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadCreateServiceDataStatic.class, null, false);
    }

    public static ActivityThreadCreateServiceDataStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadCreateServiceDataStatic.class, null, true);
    }

    public static ActivityThreadCreateServiceDataContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadCreateServiceDataContext.class, caller, false);
    }

    public static ActivityThreadCreateServiceDataContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadCreateServiceDataContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ActivityThreadCreateServiceDataContext.class);
    }
}
