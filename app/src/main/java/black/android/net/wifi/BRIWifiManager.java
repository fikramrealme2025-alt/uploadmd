package black.android.net.wifi;

public class BRIWifiManager {
    public static IWifiManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IWifiManagerStatic.class, null, false);
    }

    public static IWifiManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IWifiManagerStatic.class, null, true);
    }

    public static IWifiManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IWifiManagerContext.class, caller, false);
    }

    public static IWifiManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IWifiManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IWifiManagerContext.class);
    }
}
