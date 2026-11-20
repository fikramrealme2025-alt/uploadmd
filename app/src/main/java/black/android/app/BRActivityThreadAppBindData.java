package black.android.app;

public class BRActivityThreadAppBindData {
    public static ActivityThreadAppBindDataStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadAppBindDataStatic.class, null, false);
    }

    public static ActivityThreadAppBindDataStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadAppBindDataStatic.class, null, true);
    }

    public static ActivityThreadAppBindDataContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadAppBindDataContext.class, caller, false);
    }

    public static ActivityThreadAppBindDataContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadAppBindDataContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ActivityThreadAppBindDataContext.class);
    }
}
