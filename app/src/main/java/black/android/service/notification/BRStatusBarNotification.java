package black.android.service.notification;

public class BRStatusBarNotification {
    public static StatusBarNotificationStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(StatusBarNotificationStatic.class, null, false);
    }

    public static StatusBarNotificationStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(StatusBarNotificationStatic.class, null, true);
    }

    public static StatusBarNotificationContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(StatusBarNotificationContext.class, caller, false);
    }

    public static StatusBarNotificationContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(StatusBarNotificationContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(StatusBarNotificationContext.class);
    }
}
