package black.android.webkit;

public class BRIWebViewUpdateService {
    public static IWebViewUpdateServiceStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IWebViewUpdateServiceStatic.class, null, false);
    }

    public static IWebViewUpdateServiceStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IWebViewUpdateServiceStatic.class, null, true);
    }

    public static IWebViewUpdateServiceContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IWebViewUpdateServiceContext.class, caller, false);
    }

    public static IWebViewUpdateServiceContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IWebViewUpdateServiceContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IWebViewUpdateServiceContext.class);
    }
}
