package black.com.android.internal;

public class BRRlayout {
    public static RlayoutStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(RlayoutStatic.class, null, false);
    }

    public static RlayoutStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(RlayoutStatic.class, null, true);
    }

    public static RlayoutContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(RlayoutContext.class, caller, false);
    }

    public static RlayoutContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(RlayoutContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(RlayoutContext.class);
    }
}
