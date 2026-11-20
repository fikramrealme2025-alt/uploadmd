package black.android.os;

public class BRMemoryFile {
    public static MemoryFileStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(MemoryFileStatic.class, null, false);
    }

    public static MemoryFileStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(MemoryFileStatic.class, null, true);
    }

    public static MemoryFileContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(MemoryFileContext.class, caller, false);
    }

    public static MemoryFileContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(MemoryFileContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(MemoryFileContext.class);
    }
}
