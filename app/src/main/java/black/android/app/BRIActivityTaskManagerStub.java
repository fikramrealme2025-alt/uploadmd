package black.android.app;

public class BRIActivityTaskManagerStub {
    public static IActivityTaskManagerStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityTaskManagerStubStatic.class, null, false);
    }

    public static IActivityTaskManagerStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityTaskManagerStubStatic.class, null, true);
    }

    public static IActivityTaskManagerStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityTaskManagerStubContext.class, caller, false);
    }

    public static IActivityTaskManagerStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityTaskManagerStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IActivityTaskManagerStubContext.class);
    }
}
