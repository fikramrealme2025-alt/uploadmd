package black.android.media.session;

public class BRISessionManagerStub {
    public static ISessionManagerStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ISessionManagerStubStatic.class, null, false);
    }

    public static ISessionManagerStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ISessionManagerStubStatic.class, null, true);
    }

    public static ISessionManagerStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ISessionManagerStubContext.class, caller, false);
    }

    public static ISessionManagerStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ISessionManagerStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ISessionManagerStubContext.class);
    }
}
