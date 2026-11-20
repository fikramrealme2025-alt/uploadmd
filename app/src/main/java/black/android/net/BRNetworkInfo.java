package black.android.net;

public class BRNetworkInfo {
    public static NetworkInfoStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(NetworkInfoStatic.class, null, false);
    }

    public static NetworkInfoStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(NetworkInfoStatic.class, null, true);
    }

    public static NetworkInfoContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(NetworkInfoContext.class, caller, false);
    }

    public static NetworkInfoContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(NetworkInfoContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(NetworkInfoContext.class);
    }
}
