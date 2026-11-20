package black.android.content;

public class BRIContentProvider {
    public static IContentProviderStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IContentProviderStatic.class, null, false);
    }

    public static IContentProviderStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IContentProviderStatic.class, null, true);
    }

    public static IContentProviderContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IContentProviderContext.class, caller, false);
    }

    public static IContentProviderContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IContentProviderContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IContentProviderContext.class);
    }
}
