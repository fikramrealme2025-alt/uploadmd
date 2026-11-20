package black.android.net.wifi;

public class BRWifiManager {
    public static WifiManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(WifiManagerStatic.class, null, false);
    }

    public static WifiManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(WifiManagerStatic.class, null, true);
    }

    public static WifiManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(WifiManagerContext.class, caller, false);
    }

    public static WifiManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(WifiManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(WifiManagerContext.class);
    }
}
