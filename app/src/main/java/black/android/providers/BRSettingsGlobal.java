package black.android.providers;

public class BRSettingsGlobal {
    public static SettingsGlobalStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsGlobalStatic.class, null, false);
    }

    public static SettingsGlobalStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsGlobalStatic.class, null, true);
    }

    public static SettingsGlobalContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsGlobalContext.class, caller, false);
    }

    public static SettingsGlobalContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsGlobalContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(SettingsGlobalContext.class);
    }
}
