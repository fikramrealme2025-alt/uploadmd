package black.android.renderscript;

public class BRRenderScriptCacheDir {
    public static RenderScriptCacheDirStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(RenderScriptCacheDirStatic.class, null, false);
    }

    public static RenderScriptCacheDirStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(RenderScriptCacheDirStatic.class, null, true);
    }

    public static RenderScriptCacheDirContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(RenderScriptCacheDirContext.class, caller, false);
    }

    public static RenderScriptCacheDirContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(RenderScriptCacheDirContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(RenderScriptCacheDirContext.class);
    }
}
