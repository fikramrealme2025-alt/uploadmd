package black.android.app;

public class BRPendingIntentO {
    public static PendingIntentOStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(PendingIntentOStatic.class, null, false);
    }

    public static PendingIntentOStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(PendingIntentOStatic.class, null, true);
    }

    public static PendingIntentOContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PendingIntentOContext.class, caller, false);
    }

    public static PendingIntentOContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PendingIntentOContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(PendingIntentOContext.class);
    }
}
