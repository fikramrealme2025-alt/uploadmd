package black.android.accounts;

public class BRIAccountManager {
    public static IAccountManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAccountManagerStatic.class, null, false);
    }

    public static IAccountManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAccountManagerStatic.class, null, true);
    }

    public static IAccountManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAccountManagerContext.class, caller, false);
    }

    public static IAccountManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAccountManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IAccountManagerContext.class);
    }
}
