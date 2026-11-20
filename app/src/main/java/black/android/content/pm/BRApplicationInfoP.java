package black.android.content.pm;

public class BRApplicationInfoP {
    public static ApplicationInfoPStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ApplicationInfoPStatic.class, null, false);
    }

    public static ApplicationInfoPStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ApplicationInfoPStatic.class, null, true);
    }

    public static ApplicationInfoPContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ApplicationInfoPContext.class, caller, false);
    }

    public static ApplicationInfoPContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ApplicationInfoPContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ApplicationInfoPContext.class);
    }
}
