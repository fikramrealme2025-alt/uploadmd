package black.android.app;

public class BRNotification {
    public static NotificationStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationStatic.class, null, false);
    }

    public static NotificationStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationStatic.class, null, true);
    }

    public static NotificationContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationContext.class, caller, false);
    }

    public static NotificationContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(NotificationContext.class);
    }
}
