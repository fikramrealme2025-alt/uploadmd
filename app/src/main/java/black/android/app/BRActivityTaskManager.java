package black.android.app;

public class BRActivityTaskManager {
    public static ActivityTaskManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityTaskManagerStatic.class, null, false);
    }

    public static ActivityTaskManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityTaskManagerStatic.class, null, true);
    }

    public static ActivityTaskManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityTaskManagerContext.class, caller, false);
    }

    public static ActivityTaskManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityTaskManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ActivityTaskManagerContext.class);
    }
}
