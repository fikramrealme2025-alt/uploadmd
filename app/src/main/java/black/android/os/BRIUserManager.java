package black.android.os;

public class BRIUserManager {
    public static IUserManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IUserManagerStatic.class, null, false);
    }

    public static IUserManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IUserManagerStatic.class, null, true);
    }

    public static IUserManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IUserManagerContext.class, caller, false);
    }

    public static IUserManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IUserManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IUserManagerContext.class);
    }
}
