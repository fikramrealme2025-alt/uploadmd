package black.android.app;

public class BRIApplicationThreadOreoStub {
    public static IApplicationThreadOreoStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IApplicationThreadOreoStubStatic.class, null, false);
    }

    public static IApplicationThreadOreoStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IApplicationThreadOreoStubStatic.class, null, true);
    }

    public static IApplicationThreadOreoStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IApplicationThreadOreoStubContext.class, caller, false);
    }

    public static IApplicationThreadOreoStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IApplicationThreadOreoStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IApplicationThreadOreoStubContext.class);
    }
}
