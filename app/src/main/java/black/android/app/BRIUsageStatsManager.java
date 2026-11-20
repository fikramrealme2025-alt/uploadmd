package black.android.app;

public class BRIUsageStatsManager {
    public static IUsageStatsManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IUsageStatsManagerStatic.class, null, false);
    }

    public static IUsageStatsManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IUsageStatsManagerStatic.class, null, true);
    }

    public static IUsageStatsManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IUsageStatsManagerContext.class, caller, false);
    }

    public static IUsageStatsManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IUsageStatsManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IUsageStatsManagerContext.class);
    }
}
