package black.android.app;

public class BRActivity {
    public static ActivityStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityStatic.class, null, false);
    }

    public static ActivityStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityStatic.class, null, true);
    }

    public static ActivityContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityContext.class, caller, false);
    }

    public static ActivityContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ActivityContext.class);
    }
}
