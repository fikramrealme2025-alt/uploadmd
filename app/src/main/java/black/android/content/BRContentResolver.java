package black.android.content;

public class BRContentResolver {
    public static ContentResolverStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ContentResolverStatic.class, null, false);
    }

    public static ContentResolverStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ContentResolverStatic.class, null, true);
    }

    public static ContentResolverContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ContentResolverContext.class, caller, false);
    }

    public static ContentResolverContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ContentResolverContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ContentResolverContext.class);
    }
}
