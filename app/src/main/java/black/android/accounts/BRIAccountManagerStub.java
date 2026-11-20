package black.android.accounts;

public class BRIAccountManagerStub {
    public static IAccountManagerStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAccountManagerStubStatic.class, null, false);
    }

    public static IAccountManagerStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAccountManagerStubStatic.class, null, true);
    }

    public static IAccountManagerStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAccountManagerStubContext.class, caller, false);
    }

    public static IAccountManagerStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAccountManagerStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IAccountManagerStubContext.class);
    }
}
