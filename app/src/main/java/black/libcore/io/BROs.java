package black.libcore.io;

public class BROs {
    public static OsStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(OsStatic.class, null, false);
    }

    public static OsStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(OsStatic.class, null, true);
    }

    public static OsContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(OsContext.class, caller, false);
    }

    public static OsContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(OsContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(OsContext.class);
    }
}
