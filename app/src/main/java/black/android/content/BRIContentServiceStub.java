package black.android.content;

public class BRIContentServiceStub {
    public static IContentServiceStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IContentServiceStubStatic.class, null, false);
    }

    public static IContentServiceStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IContentServiceStubStatic.class, null, true);
    }

    public static IContentServiceStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IContentServiceStubContext.class, caller, false);
    }

    public static IContentServiceStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IContentServiceStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IContentServiceStubContext.class);
    }
}
