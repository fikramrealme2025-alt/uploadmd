package black.android.os.storage;

public class BRStorageManager {
    public static StorageManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(StorageManagerStatic.class, null, false);
    }

    public static StorageManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(StorageManagerStatic.class, null, true);
    }

    public static StorageManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(StorageManagerContext.class, caller, false);
    }

    public static StorageManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(StorageManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(StorageManagerContext.class);
    }
}
