package black.android.content;

public class BRIRestrictionsManager {
    public static IRestrictionsManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IRestrictionsManagerStatic.class, null, false);
    }

    public static IRestrictionsManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IRestrictionsManagerStatic.class, null, true);
    }

    public static IRestrictionsManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IRestrictionsManagerContext.class, caller, false);
    }

    public static IRestrictionsManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IRestrictionsManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IRestrictionsManagerContext.class);
    }
}
