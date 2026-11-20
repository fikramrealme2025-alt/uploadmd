package black.android.view;

public class BRRenderScript {
    public static RenderScriptStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(RenderScriptStatic.class, null, false);
    }

    public static RenderScriptStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(RenderScriptStatic.class, null, true);
    }

    public static RenderScriptContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(RenderScriptContext.class, caller, false);
    }

    public static RenderScriptContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(RenderScriptContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(RenderScriptContext.class);
    }
}
