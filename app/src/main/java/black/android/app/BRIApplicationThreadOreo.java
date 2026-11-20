package black.android.app;

public class BRIApplicationThreadOreo {
    public static IApplicationThreadOreoStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IApplicationThreadOreoStatic.class, null, false);
    }

    public static IApplicationThreadOreoStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IApplicationThreadOreoStatic.class, null, true);
    }

    public static IApplicationThreadOreoContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IApplicationThreadOreoContext.class, caller, false);
    }

    public static IApplicationThreadOreoContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IApplicationThreadOreoContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IApplicationThreadOreoContext.class);
    }
}
