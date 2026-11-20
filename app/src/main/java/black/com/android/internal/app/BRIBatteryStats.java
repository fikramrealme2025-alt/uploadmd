package black.com.android.internal.app;

public class BRIBatteryStats {
    public static IBatteryStatsStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IBatteryStatsStatic.class, null, false);
    }

    public static IBatteryStatsStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IBatteryStatsStatic.class, null, true);
    }

    public static IBatteryStatsContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IBatteryStatsContext.class, caller, false);
    }

    public static IBatteryStatsContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IBatteryStatsContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IBatteryStatsContext.class);
    }
}
