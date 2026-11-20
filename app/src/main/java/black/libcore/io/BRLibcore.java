package black.libcore.io;

public class BRLibcore {
    public static LibcoreStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(LibcoreStatic.class, null, false);
    }

    public static LibcoreStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(LibcoreStatic.class, null, true);
    }

    public static LibcoreContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LibcoreContext.class, caller, false);
    }

    public static LibcoreContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LibcoreContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(LibcoreContext.class);
    }
}
