package black.android.providers;

public class BRSettingsSecure {
    public static SettingsSecureStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsSecureStatic.class, null, false);
    }

    public static SettingsSecureStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsSecureStatic.class, null, true);
    }

    public static SettingsSecureContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsSecureContext.class, caller, false);
    }

    public static SettingsSecureContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsSecureContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(SettingsSecureContext.class);
    }
}
