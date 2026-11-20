package black.android.app;

public class BRNotificationM {
    public static NotificationMStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationMStatic.class, null, false);
    }

    public static NotificationMStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationMStatic.class, null, true);
    }

    public static NotificationMContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationMContext.class, caller, false);
    }

    public static NotificationMContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationMContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(NotificationMContext.class);
    }
}
