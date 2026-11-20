package black.android.app;

public class BRNotificationL {
    public static NotificationLStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationLStatic.class, null, false);
    }

    public static NotificationLStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationLStatic.class, null, true);
    }

    public static NotificationLContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationLContext.class, caller, false);
    }

    public static NotificationLContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationLContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(NotificationLContext.class);
    }
}
