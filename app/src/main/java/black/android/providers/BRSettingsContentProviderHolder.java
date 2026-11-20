package black.android.providers;

public class BRSettingsContentProviderHolder {
    public static SettingsContentProviderHolderStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsContentProviderHolderStatic.class, null, false);
    }

    public static SettingsContentProviderHolderStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsContentProviderHolderStatic.class, null, true);
    }

    public static SettingsContentProviderHolderContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsContentProviderHolderContext.class, caller, false);
    }

    public static SettingsContentProviderHolderContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SettingsContentProviderHolderContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(SettingsContentProviderHolderContext.class);
    }
}
