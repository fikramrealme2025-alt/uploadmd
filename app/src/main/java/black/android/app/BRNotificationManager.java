package black.android.app;

public class BRNotificationManager {
    public static NotificationManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationManagerStatic.class, null, false);
    }

    public static NotificationManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationManagerStatic.class, null, true);
    }

    public static NotificationManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationManagerContext.class, caller, false);
    }

    public static NotificationManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(NotificationManagerContext.class);
    }
}
