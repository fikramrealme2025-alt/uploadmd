package black.android.media;

public class BRMediaRouter {
    public static MediaRouterStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(MediaRouterStatic.class, null, false);
    }

    public static MediaRouterStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(MediaRouterStatic.class, null, true);
    }

    public static MediaRouterContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(MediaRouterContext.class, caller, false);
    }

    public static MediaRouterContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(MediaRouterContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(MediaRouterContext.class);
    }
}
