package black.android.app.job;

public class BRJobParameters {
    public static JobParametersStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(JobParametersStatic.class, null, false);
    }

    public static JobParametersStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(JobParametersStatic.class, null, true);
    }

    public static JobParametersContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(JobParametersContext.class, caller, false);
    }

    public static JobParametersContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(JobParametersContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(JobParametersContext.class);
    }
}
