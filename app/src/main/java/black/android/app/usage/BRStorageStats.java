package black.android.app.usage;

public class BRStorageStats {
    public static StorageStatsStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(StorageStatsStatic.class, null, false);
    }

    public static StorageStatsStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(StorageStatsStatic.class, null, true);
    }

    public static StorageStatsContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(StorageStatsContext.class, caller, false);
    }

    public static StorageStatsContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(StorageStatsContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(StorageStatsContext.class);
    }
}
