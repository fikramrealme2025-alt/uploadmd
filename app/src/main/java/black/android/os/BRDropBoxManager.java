package black.android.os;

public class BRDropBoxManager {
    public static DropBoxManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(DropBoxManagerStatic.class, null, false);
    }

    public static DropBoxManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(DropBoxManagerStatic.class, null, true);
    }

    public static DropBoxManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(DropBoxManagerContext.class, caller, false);
    }

    public static DropBoxManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(DropBoxManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(DropBoxManagerContext.class);
    }
}
