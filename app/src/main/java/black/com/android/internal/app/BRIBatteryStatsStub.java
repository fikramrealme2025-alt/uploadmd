package black.com.android.internal.app;

public class BRIBatteryStatsStub {
    public static IBatteryStatsStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IBatteryStatsStubStatic.class, null, false);
    }

    public static IBatteryStatsStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IBatteryStatsStubStatic.class, null, true);
    }

    public static IBatteryStatsStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IBatteryStatsStubContext.class, caller, false);
    }

    public static IBatteryStatsStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IBatteryStatsStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IBatteryStatsStubContext.class);
    }
}
