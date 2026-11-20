package black.android.net;

public class BRIVpnManagerStub {
    public static IVpnManagerStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IVpnManagerStubStatic.class, null, false);
    }

    public static IVpnManagerStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IVpnManagerStubStatic.class, null, true);
    }

    public static IVpnManagerStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IVpnManagerStubContext.class, caller, false);
    }

    public static IVpnManagerStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IVpnManagerStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IVpnManagerStubContext.class);
    }
}
