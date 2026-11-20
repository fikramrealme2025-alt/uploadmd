package black.java.io;

public class BRUnixFileSystem {
    public static UnixFileSystemStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(UnixFileSystemStatic.class, null, false);
    }

    public static UnixFileSystemStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(UnixFileSystemStatic.class, null, true);
    }

    public static UnixFileSystemContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(UnixFileSystemContext.class, caller, false);
    }

    public static UnixFileSystemContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(UnixFileSystemContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(UnixFileSystemContext.class);
    }
}
