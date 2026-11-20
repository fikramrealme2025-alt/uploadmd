package black.android.os;

public class BRBundleICS {
    public static BundleICSStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(BundleICSStatic.class, null, false);
    }

    public static BundleICSStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(BundleICSStatic.class, null, true);
    }

    public static BundleICSContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(BundleICSContext.class, caller, false);
    }

    public static BundleICSContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(BundleICSContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(BundleICSContext.class);
    }
}
