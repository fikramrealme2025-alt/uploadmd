package black.android.app;

public class BRIServiceConnectionO {
    public static IServiceConnectionOStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IServiceConnectionOStatic.class, null, false);
    }

    public static IServiceConnectionOStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IServiceConnectionOStatic.class, null, true);
    }

    public static IServiceConnectionOContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IServiceConnectionOContext.class, caller, false);
    }

    public static IServiceConnectionOContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IServiceConnectionOContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IServiceConnectionOContext.class);
    }
}
