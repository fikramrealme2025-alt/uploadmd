package black.android.net.wifi;

public class BRIWifiManagerStub {
    public static IWifiManagerStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IWifiManagerStubStatic.class, null, false);
    }

    public static IWifiManagerStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IWifiManagerStubStatic.class, null, true);
    }

    public static IWifiManagerStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IWifiManagerStubContext.class, caller, false);
    }

    public static IWifiManagerStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IWifiManagerStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IWifiManagerStubContext.class);
    }
}
