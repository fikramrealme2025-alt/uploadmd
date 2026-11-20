package black.android.os.health;

public class BRSystemHealthManager {
    public static SystemHealthManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(SystemHealthManagerStatic.class, null, false);
    }

    public static SystemHealthManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(SystemHealthManagerStatic.class, null, true);
    }

    public static SystemHealthManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SystemHealthManagerContext.class, caller, false);
    }

    public static SystemHealthManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SystemHealthManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(SystemHealthManagerContext.class);
    }
}
