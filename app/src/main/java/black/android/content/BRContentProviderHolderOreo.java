package black.android.content;

public class BRContentProviderHolderOreo {
    public static ContentProviderHolderOreoStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ContentProviderHolderOreoStatic.class, null, false);
    }

    public static ContentProviderHolderOreoStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ContentProviderHolderOreoStatic.class, null, true);
    }

    public static ContentProviderHolderOreoContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ContentProviderHolderOreoContext.class, caller, false);
    }

    public static ContentProviderHolderOreoContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ContentProviderHolderOreoContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ContentProviderHolderOreoContext.class);
    }
}
