package black.android.app;

public class BRISearchManager {
    public static ISearchManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ISearchManagerStatic.class, null, false);
    }

    public static ISearchManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ISearchManagerStatic.class, null, true);
    }

    public static ISearchManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ISearchManagerContext.class, caller, false);
    }

    public static ISearchManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ISearchManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ISearchManagerContext.class);
    }
}
