package black.android.content;

public class BRContentProviderClientQ {
    public static ContentProviderClientQStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ContentProviderClientQStatic.class, null, false);
    }

    public static ContentProviderClientQStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ContentProviderClientQStatic.class, null, true);
    }

    public static ContentProviderClientQContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ContentProviderClientQContext.class, caller, false);
    }

    public static ContentProviderClientQContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ContentProviderClientQContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ContentProviderClientQContext.class);
    }
}
