package black.android.media;

public class BRIMediaRouterServiceStub {
    public static IMediaRouterServiceStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IMediaRouterServiceStubStatic.class, null, false);
    }

    public static IMediaRouterServiceStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IMediaRouterServiceStubStatic.class, null, true);
    }

    public static IMediaRouterServiceStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IMediaRouterServiceStubContext.class, caller, false);
    }

    public static IMediaRouterServiceStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IMediaRouterServiceStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IMediaRouterServiceStubContext.class);
    }
}
