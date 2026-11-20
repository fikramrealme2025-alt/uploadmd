package black.android.app.job;

public class BRJobWorkItem {
    public static JobWorkItemStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(JobWorkItemStatic.class, null, false);
    }

    public static JobWorkItemStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(JobWorkItemStatic.class, null, true);
    }

    public static JobWorkItemContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(JobWorkItemContext.class, caller, false);
    }

    public static JobWorkItemContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(JobWorkItemContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(JobWorkItemContext.class);
    }
}
