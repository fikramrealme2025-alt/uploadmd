package black.com.android.internal.app;

public class BRIAppOpsServiceStub {
    public static IAppOpsServiceStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAppOpsServiceStubStatic.class, null, false);
    }

    public static IAppOpsServiceStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAppOpsServiceStubStatic.class, null, true);
    }

    public static IAppOpsServiceStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAppOpsServiceStubContext.class, caller, false);
    }

    public static IAppOpsServiceStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAppOpsServiceStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IAppOpsServiceStubContext.class);
    }
}
