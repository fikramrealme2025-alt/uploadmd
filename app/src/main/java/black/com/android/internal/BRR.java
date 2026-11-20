package black.com.android.internal;

public class BRR {
    public static RStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(RStatic.class, null, false);
    }

    public static RStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(RStatic.class, null, true);
    }

    public static RContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(RContext.class, caller, false);
    }

    public static RContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(RContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(RContext.class);
    }
}
