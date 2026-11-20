package black.android.content;

public class BRPeriodicSync {
    public static PeriodicSyncStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(PeriodicSyncStatic.class, null, false);
    }

    public static PeriodicSyncStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(PeriodicSyncStatic.class, null, true);
    }

    public static PeriodicSyncContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PeriodicSyncContext.class, caller, false);
    }

    public static PeriodicSyncContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PeriodicSyncContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(PeriodicSyncContext.class);
    }
}
