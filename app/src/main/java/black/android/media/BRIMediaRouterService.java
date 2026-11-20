package black.android.media;

public class BRIMediaRouterService {
    public static IMediaRouterServiceStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IMediaRouterServiceStatic.class, null, false);
    }

    public static IMediaRouterServiceStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IMediaRouterServiceStatic.class, null, true);
    }

    public static IMediaRouterServiceContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IMediaRouterServiceContext.class, caller, false);
    }

    public static IMediaRouterServiceContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IMediaRouterServiceContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IMediaRouterServiceContext.class);
    }
}
