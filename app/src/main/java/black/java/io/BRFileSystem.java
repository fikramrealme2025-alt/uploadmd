package black.java.io;

public class BRFileSystem {
    public static FileSystemStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(FileSystemStatic.class, null, false);
    }

    public static FileSystemStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(FileSystemStatic.class, null, true);
    }

    public static FileSystemContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(FileSystemContext.class, caller, false);
    }

    public static FileSystemContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(FileSystemContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(FileSystemContext.class);
    }
}
