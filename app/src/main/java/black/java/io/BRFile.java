package black.java.io;

public class BRFile {
    public static FileStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(FileStatic.class, null, false);
    }

    public static FileStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(FileStatic.class, null, true);
    }

    public static FileContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(FileContext.class, caller, false);
    }

    public static FileContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(FileContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(FileContext.class);
    }
}
