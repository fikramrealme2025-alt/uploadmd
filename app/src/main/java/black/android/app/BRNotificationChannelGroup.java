package black.android.app;

public class BRNotificationChannelGroup {
    public static NotificationChannelGroupStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationChannelGroupStatic.class, null, false);
    }

    public static NotificationChannelGroupStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationChannelGroupStatic.class, null, true);
    }

    public static NotificationChannelGroupContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationChannelGroupContext.class, caller, false);
    }

    public static NotificationChannelGroupContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationChannelGroupContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(NotificationChannelGroupContext.class);
    }
}
