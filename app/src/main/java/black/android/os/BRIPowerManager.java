package black.android.os;

public class BRIPowerManager {
    public static IPowerManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IPowerManagerStatic.class, null, false);
    }

    public static IPowerManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IPowerManagerStatic.class, null, true);
    }

    public static IPowerManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IPowerManagerContext.class, caller, false);
    }

    public static IPowerManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IPowerManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IPowerManagerContext.class);
    }
}
