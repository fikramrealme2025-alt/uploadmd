package black.android.os;

public class BRINetworkManagementServiceStub {
    public static INetworkManagementServiceStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(INetworkManagementServiceStubStatic.class, null, false);
    }

    public static INetworkManagementServiceStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(INetworkManagementServiceStubStatic.class, null, true);
    }

    public static INetworkManagementServiceStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(INetworkManagementServiceStubContext.class, caller, false);
    }

    public static INetworkManagementServiceStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(INetworkManagementServiceStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(INetworkManagementServiceStubContext.class);
    }
}
