package black.android.net;

public class BRIVpnManager {
    public static IVpnManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IVpnManagerStatic.class, null, false);
    }

    public static IVpnManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IVpnManagerStatic.class, null, true);
    }

    public static IVpnManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IVpnManagerContext.class, caller, false);
    }

    public static IVpnManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IVpnManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IVpnManagerContext.class);
    }
}
