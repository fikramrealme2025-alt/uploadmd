package black.android.widget;

public class BRRemoteViews {
    public static RemoteViewsStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(RemoteViewsStatic.class, null, false);
    }

    public static RemoteViewsStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(RemoteViewsStatic.class, null, true);
    }

    public static RemoteViewsContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(RemoteViewsContext.class, caller, false);
    }

    public static RemoteViewsContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(RemoteViewsContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(RemoteViewsContext.class);
    }
}
