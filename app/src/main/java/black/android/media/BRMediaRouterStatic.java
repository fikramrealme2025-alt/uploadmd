package black.android.media;

public class BRMediaRouterStatic {
    public static MediaRouterStaticStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(MediaRouterStaticStatic.class, null, false);
    }

    public static MediaRouterStaticStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(MediaRouterStaticStatic.class, null, true);
    }

    public static MediaRouterStaticContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(MediaRouterStaticContext.class, caller, false);
    }

    public static MediaRouterStaticContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(MediaRouterStaticContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(MediaRouterStaticContext.class);
    }
}
