package black.android.app;

public class BRActivityThreadProviderClientRecordJB {
    public static ActivityThreadProviderClientRecordJBStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadProviderClientRecordJBStatic.class, null, false);
    }

    public static ActivityThreadProviderClientRecordJBStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadProviderClientRecordJBStatic.class, null, true);
    }

    public static ActivityThreadProviderClientRecordJBContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadProviderClientRecordJBContext.class, caller, false);
    }

    public static ActivityThreadProviderClientRecordJBContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadProviderClientRecordJBContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ActivityThreadProviderClientRecordJBContext.class);
    }
}
