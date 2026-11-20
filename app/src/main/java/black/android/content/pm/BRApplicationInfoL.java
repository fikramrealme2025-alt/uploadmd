package black.android.content.pm;

public class BRApplicationInfoL {
    public static ApplicationInfoLStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ApplicationInfoLStatic.class, null, false);
    }

    public static ApplicationInfoLStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ApplicationInfoLStatic.class, null, true);
    }

    public static ApplicationInfoLContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ApplicationInfoLContext.class, caller, false);
    }

    public static ApplicationInfoLContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ApplicationInfoLContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ApplicationInfoLContext.class);
    }
}
