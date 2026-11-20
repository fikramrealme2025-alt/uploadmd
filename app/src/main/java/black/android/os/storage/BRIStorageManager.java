package black.android.os.storage;

public class BRIStorageManager {
    public static IStorageManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IStorageManagerStatic.class, null, false);
    }

    public static IStorageManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IStorageManagerStatic.class, null, true);
    }

    public static IStorageManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IStorageManagerContext.class, caller, false);
    }

    public static IStorageManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IStorageManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IStorageManagerContext.class);
    }
}
