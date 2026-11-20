package black.android.app.job;

public class BRJobInfo {
    public static JobInfoStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(JobInfoStatic.class, null, false);
    }

    public static JobInfoStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(JobInfoStatic.class, null, true);
    }

    public static JobInfoContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(JobInfoContext.class, caller, false);
    }

    public static JobInfoContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(JobInfoContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(JobInfoContext.class);
    }
}
