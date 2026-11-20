package black.android.media.session;

public class BRISessionManager {
    public static ISessionManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ISessionManagerStatic.class, null, false);
    }

    public static ISessionManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ISessionManagerStatic.class, null, true);
    }

    public static ISessionManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ISessionManagerContext.class, caller, false);
    }

    public static ISessionManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ISessionManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ISessionManagerContext.class);
    }
}
