package black.android.graphics;

public class BRCompatibility {
    public static CompatibilityStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(CompatibilityStatic.class, null, false);
    }

    public static CompatibilityStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(CompatibilityStatic.class, null, true);
    }

    public static CompatibilityContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(CompatibilityContext.class, caller, false);
    }

    public static CompatibilityContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(CompatibilityContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(CompatibilityContext.class);
    }
}
