package black.android.app;

public class BRApplicationThreadNative {
    public static ApplicationThreadNativeStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ApplicationThreadNativeStatic.class, null, false);
    }

    public static ApplicationThreadNativeStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ApplicationThreadNativeStatic.class, null, true);
    }

    public static ApplicationThreadNativeContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ApplicationThreadNativeContext.class, caller, false);
    }

    public static ApplicationThreadNativeContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ApplicationThreadNativeContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ApplicationThreadNativeContext.class);
    }
}
