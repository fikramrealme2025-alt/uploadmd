package black.android.providers;

public class BRSettingsNameValueCache {
    public static SettingsNameValueCacheStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsNameValueCacheStatic.class, null, false);
    }

    public static SettingsNameValueCacheStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsNameValueCacheStatic.class, null, true);
    }

    public static SettingsNameValueCacheContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsNameValueCacheContext.class, caller, false);
    }

    public static SettingsNameValueCacheContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsNameValueCacheContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(SettingsNameValueCacheContext.class);
    }
}
