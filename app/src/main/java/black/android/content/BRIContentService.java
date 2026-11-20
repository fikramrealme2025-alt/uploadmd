package black.android.content;

public class BRIContentService {
    public static IContentServiceStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IContentServiceStatic.class, null, false);
    }

    public static IContentServiceStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IContentServiceStatic.class, null, true);
    }

    public static IContentServiceContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IContentServiceContext.class, caller, false);
    }

    public static IContentServiceContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IContentServiceContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IContentServiceContext.class);
    }
}
