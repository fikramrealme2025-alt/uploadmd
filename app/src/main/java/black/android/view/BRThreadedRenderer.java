package black.android.view;

public class BRThreadedRenderer {
    public static ThreadedRendererStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ThreadedRendererStatic.class, null, false);
    }

    public static ThreadedRendererStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ThreadedRendererStatic.class, null, true);
    }

    public static ThreadedRendererContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ThreadedRendererContext.class, caller, false);
    }

    public static ThreadedRendererContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ThreadedRendererContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ThreadedRendererContext.class);
    }
}
