package black.android.net;

public class BRIConnectivityManagerStub {
    public static IConnectivityManagerStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IConnectivityManagerStubStatic.class, null, false);
    }

    public static IConnectivityManagerStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IConnectivityManagerStubStatic.class, null, true);
    }

    public static IConnectivityManagerStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IConnectivityManagerStubContext.class, caller, false);
    }

    public static IConnectivityManagerStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IConnectivityManagerStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IConnectivityManagerStubContext.class);
    }
}
