package black.com.android.internal.app;

public class BRISmtOpsServiceStub {
    public static ISmtOpsServiceStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ISmtOpsServiceStubStatic.class, null, false);
    }

    public static ISmtOpsServiceStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ISmtOpsServiceStubStatic.class, null, true);
    }

    public static ISmtOpsServiceStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ISmtOpsServiceStubContext.class, caller, false);
    }

    public static ISmtOpsServiceStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ISmtOpsServiceStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ISmtOpsServiceStubContext.class);
    }
}
