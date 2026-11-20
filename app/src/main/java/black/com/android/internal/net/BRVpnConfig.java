package black.com.android.internal.net;

public class BRVpnConfig {
    public static VpnConfigStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(VpnConfigStatic.class, null, false);
    }

    public static VpnConfigStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(VpnConfigStatic.class, null, true);
    }

    public static VpnConfigContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(VpnConfigContext.class, caller, false);
    }

    public static VpnConfigContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(VpnConfigContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(VpnConfigContext.class);
    }
}
