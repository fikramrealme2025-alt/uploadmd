package black.android.content;

public class BRContentProviderClient {
    public static ContentProviderClientStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ContentProviderClientStatic.class, null, false);
    }

    public static ContentProviderClientStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ContentProviderClientStatic.class, null, true);
    }

    public static ContentProviderClientContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ContentProviderClientContext.class, caller, false);
    }

    public static ContentProviderClientContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ContentProviderClientContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ContentProviderClientContext.class);
    }
}
