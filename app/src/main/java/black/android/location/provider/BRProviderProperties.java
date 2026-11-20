package black.android.location.provider;

public class BRProviderProperties {
    public static ProviderPropertiesStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ProviderPropertiesStatic.class, null, false);
    }

    public static ProviderPropertiesStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ProviderPropertiesStatic.class, null, true);
    }

    public static ProviderPropertiesContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ProviderPropertiesContext.class, caller, false);
    }

    public static ProviderPropertiesContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ProviderPropertiesContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ProviderPropertiesContext.class);
    }
}
