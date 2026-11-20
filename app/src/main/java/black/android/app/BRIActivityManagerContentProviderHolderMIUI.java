package black.android.app;

public class BRIActivityManagerContentProviderHolderMIUI {
    public static IActivityManagerContentProviderHolderMIUIStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityManagerContentProviderHolderMIUIStatic.class, null, false);
    }

    public static IActivityManagerContentProviderHolderMIUIStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityManagerContentProviderHolderMIUIStatic.class, null, true);
    }

    public static IActivityManagerContentProviderHolderMIUIContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityManagerContentProviderHolderMIUIContext.class, caller, false);
    }

    public static IActivityManagerContentProviderHolderMIUIContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IActivityManagerContentProviderHolderMIUIContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IActivityManagerContentProviderHolderMIUIContext.class);
    }
}
