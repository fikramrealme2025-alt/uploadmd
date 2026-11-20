package black.android.app;

public class BRActivityThreadProviderClientRecord {
    public static ActivityThreadProviderClientRecordStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadProviderClientRecordStatic.class, null, false);
    }

    public static ActivityThreadProviderClientRecordStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadProviderClientRecordStatic.class, null, true);
    }

    public static ActivityThreadProviderClientRecordContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadProviderClientRecordContext.class, caller, false);
    }

    public static ActivityThreadProviderClientRecordContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadProviderClientRecordContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ActivityThreadProviderClientRecordContext.class);
    }
}
