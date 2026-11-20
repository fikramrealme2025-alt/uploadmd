package black.android.app;

public class BRActivityManagerNative {
    public static ActivityManagerNativeStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityManagerNativeStatic.class, null, false);
    }

    public static ActivityManagerNativeStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityManagerNativeStatic.class, null, true);
    }

    public static ActivityManagerNativeContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityManagerNativeContext.class, caller, false);
    }

    public static ActivityManagerNativeContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityManagerNativeContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ActivityManagerNativeContext.class);
    }
}
