package black.android.os;

public class BRIUserManagerStub {
    public static IUserManagerStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IUserManagerStubStatic.class, null, false);
    }

    public static IUserManagerStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IUserManagerStubStatic.class, null, true);
    }

    public static IUserManagerStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IUserManagerStubContext.class, caller, false);
    }

    public static IUserManagerStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IUserManagerStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IUserManagerStubContext.class);
    }
}
