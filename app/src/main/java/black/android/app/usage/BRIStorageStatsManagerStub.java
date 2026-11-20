package black.android.app.usage;

public class BRIStorageStatsManagerStub {
    public static IStorageStatsManagerStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IStorageStatsManagerStubStatic.class, null, false);
    }

    public static IStorageStatsManagerStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IStorageStatsManagerStubStatic.class, null, true);
    }

    public static IStorageStatsManagerStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IStorageStatsManagerStubContext.class, caller, false);
    }

    public static IStorageStatsManagerStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IStorageStatsManagerStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IStorageStatsManagerStubContext.class);
    }
}
