package black.android.os.storage;

public class BRStorageVolume {
    public static StorageVolumeStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(StorageVolumeStatic.class, null, false);
    }

    public static StorageVolumeStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(StorageVolumeStatic.class, null, true);
    }

    public static StorageVolumeContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(StorageVolumeContext.class, caller, false);
    }

    public static StorageVolumeContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(StorageVolumeContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(StorageVolumeContext.class);
    }
}
