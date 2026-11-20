package black.android.app;

public class BRISearchManagerStub {
    public static ISearchManagerStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ISearchManagerStubStatic.class, null, false);
    }

    public static ISearchManagerStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ISearchManagerStubStatic.class, null, true);
    }

    public static ISearchManagerStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ISearchManagerStubContext.class, caller, false);
    }

    public static ISearchManagerStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ISearchManagerStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ISearchManagerStubContext.class);
    }
}
