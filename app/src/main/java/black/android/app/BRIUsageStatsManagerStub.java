package black.android.app;

public class BRIUsageStatsManagerStub {
    public static IUsageStatsManagerStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IUsageStatsManagerStubStatic.class, null, false);
    }

    public static IUsageStatsManagerStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IUsageStatsManagerStubStatic.class, null, true);
    }

    public static IUsageStatsManagerStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IUsageStatsManagerStubContext.class, caller, false);
    }

    public static IUsageStatsManagerStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IUsageStatsManagerStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IUsageStatsManagerStubContext.class);
    }
}
