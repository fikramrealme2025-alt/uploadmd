package black.android.app;

public class BRPendingIntentJBMR2 {
    public static PendingIntentJBMR2Static get() {
        return top.niunaijun.blackreflection.BlackReflection.create(PendingIntentJBMR2Static.class, null, false);
    }

    public static PendingIntentJBMR2Static getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(PendingIntentJBMR2Static.class, null, true);
    }

    public static PendingIntentJBMR2Context get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PendingIntentJBMR2Context.class, caller, false);
    }

    public static PendingIntentJBMR2Context getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PendingIntentJBMR2Context.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(PendingIntentJBMR2Context.class);
    }
}
