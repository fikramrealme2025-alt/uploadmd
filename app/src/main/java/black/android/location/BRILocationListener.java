package black.android.location;

public class BRILocationListener {
    public static ILocationListenerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ILocationListenerStatic.class, null, false);
    }

    public static ILocationListenerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ILocationListenerStatic.class, null, true);
    }

    public static ILocationListenerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ILocationListenerContext.class, caller, false);
    }

    public static ILocationListenerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ILocationListenerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ILocationListenerContext.class);
    }
}
