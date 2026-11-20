package black.android.app.job;

public class BRIJobScheduler {
    public static IJobSchedulerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IJobSchedulerStatic.class, null, false);
    }

    public static IJobSchedulerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IJobSchedulerStatic.class, null, true);
    }

    public static IJobSchedulerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IJobSchedulerContext.class, caller, false);
    }

    public static IJobSchedulerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IJobSchedulerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IJobSchedulerContext.class);
    }
}
