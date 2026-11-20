package black.android.app;

public class BRContextImplKitkat {
    public static ContextImplKitkatStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ContextImplKitkatStatic.class, null, false);
    }

    public static ContextImplKitkatStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ContextImplKitkatStatic.class, null, true);
    }

    public static ContextImplKitkatContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ContextImplKitkatContext.class, caller, false);
    }

    public static ContextImplKitkatContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ContextImplKitkatContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ContextImplKitkatContext.class);
    }
}
