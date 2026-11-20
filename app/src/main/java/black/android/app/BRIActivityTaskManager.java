package black.android.app;

public class BRIActivityTaskManager {
    public static IActivityTaskManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityTaskManagerStatic.class, null, false);
    }

    public static IActivityTaskManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityTaskManagerStatic.class, null, true);
    }

    public static IActivityTaskManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityTaskManagerContext.class, caller, false);
    }

    public static IActivityTaskManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityTaskManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IActivityTaskManagerContext.class);
    }
}
