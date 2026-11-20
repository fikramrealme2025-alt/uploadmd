package black.android.app.job;

public class BRIJobSchedulerStub {
    public static IJobSchedulerStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IJobSchedulerStubStatic.class, null, false);
    }

    public static IJobSchedulerStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IJobSchedulerStubStatic.class, null, true);
    }

    public static IJobSchedulerStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IJobSchedulerStubContext.class, caller, false);
    }

    public static IJobSchedulerStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IJobSchedulerStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IJobSchedulerStubContext.class);
    }
}
