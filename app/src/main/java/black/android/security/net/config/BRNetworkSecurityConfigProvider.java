package black.android.security.net.config;

public class BRNetworkSecurityConfigProvider {
    public static NetworkSecurityConfigProviderStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(NetworkSecurityConfigProviderStatic.class, null, false);
    }

    public static NetworkSecurityConfigProviderStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(NetworkSecurityConfigProviderStatic.class, null, true);
    }

    public static NetworkSecurityConfigProviderContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(NetworkSecurityConfigProviderContext.class, caller, false);
    }

    public static NetworkSecurityConfigProviderContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(NetworkSecurityConfigProviderContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(NetworkSecurityConfigProviderContext.class);
    }
}
