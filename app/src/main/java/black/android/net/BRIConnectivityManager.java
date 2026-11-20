package black.android.net;

public class BRIConnectivityManager {
    public static IConnectivityManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IConnectivityManagerStatic.class, null, false);
    }

    public static IConnectivityManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IConnectivityManagerStatic.class, null, true);
    }

    public static IConnectivityManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IConnectivityManagerContext.class, caller, false);
    }

    public static IConnectivityManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IConnectivityManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IConnectivityManagerContext.class);
    }
}
