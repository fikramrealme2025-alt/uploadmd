package black.android.content;

public class BRContentProviderNative {
    public static ContentProviderNativeStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ContentProviderNativeStatic.class, null, false);
    }

    public static ContentProviderNativeStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ContentProviderNativeStatic.class, null, true);
    }

    public static ContentProviderNativeContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ContentProviderNativeContext.class, caller, false);
    }

    public static ContentProviderNativeContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ContentProviderNativeContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ContentProviderNativeContext.class);
    }
}
