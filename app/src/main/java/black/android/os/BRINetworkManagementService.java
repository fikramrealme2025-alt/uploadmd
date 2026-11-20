package black.android.os;

public class BRINetworkManagementService {
    public static INetworkManagementServiceStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(INetworkManagementServiceStatic.class, null, false);
    }

    public static INetworkManagementServiceStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(INetworkManagementServiceStatic.class, null, true);
    }

    public static INetworkManagementServiceContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(INetworkManagementServiceContext.class, caller, false);
    }

    public static INetworkManagementServiceContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(INetworkManagementServiceContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(INetworkManagementServiceContext.class);
    }
}
