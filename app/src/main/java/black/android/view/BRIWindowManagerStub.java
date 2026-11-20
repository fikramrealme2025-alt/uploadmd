package black.android.view;

public class BRIWindowManagerStub {
    public static IWindowManagerStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IWindowManagerStubStatic.class, null, false);
    }

    public static IWindowManagerStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IWindowManagerStubStatic.class, null, true);
    }

    public static IWindowManagerStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IWindowManagerStubContext.class, caller, false);
    }

    public static IWindowManagerStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IWindowManagerStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IWindowManagerStubContext.class);
    }
}
