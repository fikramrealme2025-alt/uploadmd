package black.android.view;

public class BRCompatibilityInfoHolder {
    public static CompatibilityInfoHolderStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(CompatibilityInfoHolderStatic.class, null, false);
    }

    public static CompatibilityInfoHolderStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(CompatibilityInfoHolderStatic.class, null, true);
    }

    public static CompatibilityInfoHolderContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(CompatibilityInfoHolderContext.class, caller, false);
    }

    public static CompatibilityInfoHolderContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(CompatibilityInfoHolderContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(CompatibilityInfoHolderContext.class);
    }
}
