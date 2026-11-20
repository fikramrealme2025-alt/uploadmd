package black.android.providers;

public class BRSettings {
    public static SettingsStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsStatic.class, null, false);
    }

    public static SettingsStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsStatic.class, null, true);
    }

    public static SettingsContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsContext.class, caller, false);
    }

    public static SettingsContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(SettingsContext.class);
    }
}
