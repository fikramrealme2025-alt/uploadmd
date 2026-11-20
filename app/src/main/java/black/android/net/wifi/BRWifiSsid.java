package black.android.net.wifi;

public class BRWifiSsid {
    public static WifiSsidStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(WifiSsidStatic.class, null, false);
    }

    public static WifiSsidStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(WifiSsidStatic.class, null, true);
    }

    public static WifiSsidContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(WifiSsidContext.class, caller, false);
    }

    public static WifiSsidContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(WifiSsidContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(WifiSsidContext.class);
    }
}
