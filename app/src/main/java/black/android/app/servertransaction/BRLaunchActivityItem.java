package black.android.app.servertransaction;

public class BRLaunchActivityItem {
    public static LaunchActivityItemStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(LaunchActivityItemStatic.class, null, false);
    }

    public static LaunchActivityItemStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(LaunchActivityItemStatic.class, null, true);
    }

    public static LaunchActivityItemContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LaunchActivityItemContext.class, caller, false);
    }

    public static LaunchActivityItemContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(LaunchActivityItemContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(LaunchActivityItemContext.class);
    }
}
