package black.android.content;

public class BRIRestrictionsManagerStub {
    public static IRestrictionsManagerStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IRestrictionsManagerStubStatic.class, null, false);
    }

    public static IRestrictionsManagerStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IRestrictionsManagerStubStatic.class, null, true);
    }

    public static IRestrictionsManagerStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IRestrictionsManagerStubContext.class, caller, false);
    }

    public static IRestrictionsManagerStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IRestrictionsManagerStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IRestrictionsManagerStubContext.class);
    }
}
