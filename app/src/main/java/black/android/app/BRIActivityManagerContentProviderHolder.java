package black.android.app;

public class BRIActivityManagerContentProviderHolder {
    public static IActivityManagerContentProviderHolderStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityManagerContentProviderHolderStatic.class, null, false);
    }

    public static IActivityManagerContentProviderHolderStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityManagerContentProviderHolderStatic.class, null, true);
    }

    public static IActivityManagerContentProviderHolderContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityManagerContentProviderHolderContext.class, caller, false);
    }

    public static IActivityManagerContentProviderHolderContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityManagerContentProviderHolderContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IActivityManagerContentProviderHolderContext.class);
    }
}
