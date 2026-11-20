package black.android.providers;

public class BRSettingsNameValueCacheOreo {
    public static SettingsNameValueCacheOreoStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsNameValueCacheOreoStatic.class, null, false);
    }

    public static SettingsNameValueCacheOreoStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsNameValueCacheOreoStatic.class, null, true);
    }

    public static SettingsNameValueCacheOreoContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsNameValueCacheOreoContext.class, caller, false);
    }

    public static SettingsNameValueCacheOreoContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsNameValueCacheOreoContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(SettingsNameValueCacheOreoContext.class);
    }
}
