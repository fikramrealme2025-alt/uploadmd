package black.android.hardware.location;

public class BRIContextHubService {
    public static IContextHubServiceStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IContextHubServiceStatic.class, null, false);
    }

    public static IContextHubServiceStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IContextHubServiceStatic.class, null, true);
    }

    public static IContextHubServiceContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IContextHubServiceContext.class, caller, false);
    }

    public static IContextHubServiceContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IContextHubServiceContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IContextHubServiceContext.class);
    }
}
