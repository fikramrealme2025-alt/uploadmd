package black.android.app;

public class BRContextImpl {
    public static ContextImplStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ContextImplStatic.class, null, false);
    }

    public static ContextImplStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ContextImplStatic.class, null, true);
    }

    public static ContextImplContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ContextImplContext.class, caller, false);
    }

    public static ContextImplContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ContextImplContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ContextImplContext.class);
    }
}
