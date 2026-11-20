package black.android.media;

public class BRMediaRouterStaticKitkat {
    public static MediaRouterStaticKitkatStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(MediaRouterStaticKitkatStatic.class, null, false);
    }

    public static MediaRouterStaticKitkatStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(MediaRouterStaticKitkatStatic.class, null, true);
    }

    public static MediaRouterStaticKitkatContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(MediaRouterStaticKitkatContext.class, caller, false);
    }

    public static MediaRouterStaticKitkatContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(MediaRouterStaticKitkatContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(MediaRouterStaticKitkatContext.class);
    }
}
