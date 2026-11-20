package black.android.app;

public class BRContextImplICS {
    public static ContextImplICSStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ContextImplICSStatic.class, null, false);
    }

    public static ContextImplICSStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ContextImplICSStatic.class, null, true);
    }

    public static ContextImplICSContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ContextImplICSContext.class, caller, false);
    }

    public static ContextImplICSContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ContextImplICSContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ContextImplICSContext.class);
    }
}
