package black.android.view;

public class BRIAutoFillManagerStub {
    public static IAutoFillManagerStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAutoFillManagerStubStatic.class, null, false);
    }

    public static IAutoFillManagerStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAutoFillManagerStubStatic.class, null, true);
    }

    public static IAutoFillManagerStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAutoFillManagerStubContext.class, caller, false);
    }

    public static IAutoFillManagerStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAutoFillManagerStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IAutoFillManagerStubContext.class);
    }
}
