package black.android.webkit;

public class BRWebViewFactory {
    public static WebViewFactoryStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(WebViewFactoryStatic.class, null, false);
    }

    public static WebViewFactoryStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(WebViewFactoryStatic.class, null, true);
    }

    public static WebViewFactoryContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(WebViewFactoryContext.class, caller, false);
    }

    public static WebViewFactoryContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(WebViewFactoryContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(WebViewFactoryContext.class);
    }
}
