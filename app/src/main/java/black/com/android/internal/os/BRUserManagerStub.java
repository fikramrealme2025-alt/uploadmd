package black.com.android.internal.os;

public class BRUserManagerStub {
    public static UserManagerStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(UserManagerStubStatic.class, null, false);
    }

    public static UserManagerStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(UserManagerStubStatic.class, null, true);
    }

    public static UserManagerStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(UserManagerStubContext.class, caller, false);
    }

    public static UserManagerStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(UserManagerStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(UserManagerStubContext.class);
    }
}
