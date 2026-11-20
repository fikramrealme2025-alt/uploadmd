package black.android.os;

public class BRBaseBundle {
    public static BaseBundleStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(BaseBundleStatic.class, null, false);
    }

    public static BaseBundleStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(BaseBundleStatic.class, null, true);
    }

    public static BaseBundleContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(BaseBundleContext.class, caller, false);
    }

    public static BaseBundleContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(BaseBundleContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(BaseBundleContext.class);
    }
}
