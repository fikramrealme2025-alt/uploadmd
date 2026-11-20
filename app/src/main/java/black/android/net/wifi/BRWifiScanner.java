package black.android.net.wifi;

public class BRWifiScanner {
    public static WifiScannerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(WifiScannerStatic.class, null, false);
    }

    public static WifiScannerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(WifiScannerStatic.class, null, true);
    }

    public static WifiScannerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(WifiScannerContext.class, caller, false);
    }

    public static WifiScannerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(WifiScannerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(WifiScannerContext.class);
    }
}
