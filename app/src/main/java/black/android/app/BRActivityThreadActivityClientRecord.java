package black.android.app;

public class BRActivityThreadActivityClientRecord {
    public static ActivityThreadActivityClientRecordStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadActivityClientRecordStatic.class, null, false);
    }

    public static ActivityThreadActivityClientRecordStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadActivityClientRecordStatic.class, null, true);
    }

    public static ActivityThreadActivityClientRecordContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadActivityClientRecordContext.class, caller, false);
    }

    public static ActivityThreadActivityClientRecordContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadActivityClientRecordContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ActivityThreadActivityClientRecordContext.class);
    }
}
