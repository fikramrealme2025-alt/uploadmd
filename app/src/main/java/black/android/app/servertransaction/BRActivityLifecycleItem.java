package black.android.app.servertransaction;

public class BRActivityLifecycleItem {
    public static ActivityLifecycleItemStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityLifecycleItemStatic.class, null, false);
    }

    public static ActivityLifecycleItemStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityLifecycleItemStatic.class, null, true);
    }

    public static ActivityLifecycleItemContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityLifecycleItemContext.class, caller, false);
    }

    public static ActivityLifecycleItemContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityLifecycleItemContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ActivityLifecycleItemContext.class);
    }
}
