package black.android.os;

public class BRBundle {
    public static BundleStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(BundleStatic.class, null, false);
    }

    public static BundleStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(BundleStatic.class, null, true);
    }

    public static BundleContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(BundleContext.class, caller, false);
    }

    public static BundleContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(BundleContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(BundleContext.class);
    }
}
