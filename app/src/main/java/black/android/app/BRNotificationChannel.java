package black.android.app;

public class BRNotificationChannel {
    public static NotificationChannelStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationChannelStatic.class, null, false);
    }

    public static NotificationChannelStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationChannelStatic.class, null, true);
    }

    public static NotificationChannelContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationChannelContext.class, caller, false);
    }

    public static NotificationChannelContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationChannelContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(NotificationChannelContext.class);
    }
}
