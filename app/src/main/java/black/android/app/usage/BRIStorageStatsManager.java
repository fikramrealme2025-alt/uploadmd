package black.android.app.usage;

public class BRIStorageStatsManager {
    public static IStorageStatsManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IStorageStatsManagerStatic.class, null, false);
    }

    public static IStorageStatsManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IStorageStatsManagerStatic.class, null, true);
    }

    public static IStorageStatsManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IStorageStatsManagerContext.class, caller, false);
    }

    public static IStorageStatsManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IStorageStatsManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IStorageStatsManagerContext.class);
    }
}
