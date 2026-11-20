package black.android.app;

public class BRNotificationO {
    public static NotificationOStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationOStatic.class, null, false);
    }

    public static NotificationOStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationOStatic.class, null, true);
    }

    public static NotificationOContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationOContext.class, caller, false);
    }

    public static NotificationOContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationOContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(NotificationOContext.class);
    }
}
