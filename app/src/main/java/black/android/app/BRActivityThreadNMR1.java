package black.android.app;

public class BRActivityThreadNMR1 {
    public static ActivityThreadNMR1Static get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadNMR1Static.class, null, false);
    }

    public static ActivityThreadNMR1Static getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadNMR1Static.class, null, true);
    }

    public static ActivityThreadNMR1Context get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadNMR1Context.class, caller, false);
    }

    public static ActivityThreadNMR1Context getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityThreadNMR1Context.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ActivityThreadNMR1Context.class);
    }
}
