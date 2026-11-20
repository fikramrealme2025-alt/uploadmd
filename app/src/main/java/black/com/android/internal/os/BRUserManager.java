package black.com.android.internal.os;

public class BRUserManager {
    public static UserManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(UserManagerStatic.class, null, false);
    }

    public static UserManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(UserManagerStatic.class, null, true);
    }

    public static UserManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(UserManagerContext.class, caller, false);
    }

    public static UserManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(UserManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(UserManagerContext.class);
    }
}
