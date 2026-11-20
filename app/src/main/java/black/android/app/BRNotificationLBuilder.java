package black.android.app;

public class BRNotificationLBuilder {
    public static NotificationLBuilderStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationLBuilderStatic.class, null, false);
    }

    public static NotificationLBuilderStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationLBuilderStatic.class, null, true);
    }

    public static NotificationLBuilderContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationLBuilderContext.class, caller, false);
    }

    public static NotificationLBuilderContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(NotificationLBuilderContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(NotificationLBuilderContext.class);
    }
}
