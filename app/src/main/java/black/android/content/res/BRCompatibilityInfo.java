package black.android.content.res;

public class BRCompatibilityInfo {
    public static CompatibilityInfoStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(CompatibilityInfoStatic.class, null, false);
    }

    public static CompatibilityInfoStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(CompatibilityInfoStatic.class, null, true);
    }

    public static CompatibilityInfoContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(CompatibilityInfoContext.class, caller, false);
    }

    public static CompatibilityInfoContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(CompatibilityInfoContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(CompatibilityInfoContext.class);
    }
}
