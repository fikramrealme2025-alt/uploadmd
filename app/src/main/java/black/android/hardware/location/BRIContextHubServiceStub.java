package black.android.hardware.location;

public class BRIContextHubServiceStub {
    public static IContextHubServiceStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IContextHubServiceStubStatic.class, null, false);
    }

    public static IContextHubServiceStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IContextHubServiceStubStatic.class, null, true);
    }

    public static IContextHubServiceStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IContextHubServiceStubContext.class, caller, false);
    }

    public static IContextHubServiceStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IContextHubServiceStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IContextHubServiceStubContext.class);
    }
}
