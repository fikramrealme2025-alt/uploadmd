package black.android.net.wifi;

public class BRWifiInfo {
    public static WifiInfoStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(WifiInfoStatic.class, null, false);
    }

    public static WifiInfoStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(WifiInfoStatic.class, null, true);
    }

    public static WifiInfoContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(WifiInfoContext.class, caller, false);
    }

    public static WifiInfoContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(WifiInfoContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(WifiInfoContext.class);
    }
}
