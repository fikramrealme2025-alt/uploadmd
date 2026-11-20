package black.android.providers;

public class BRSettingsSystem {
    public static SettingsSystemStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsSystemStatic.class, null, false);
    }

    public static SettingsSystemStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsSystemStatic.class, null, true);
    }

    public static SettingsSystemContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsSystemContext.class, caller, false);
    }

    public static SettingsSystemContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsSystemContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(SettingsSystemContext.class);
    }
}
