package black.android.app.admin;

public class BRIDevicePolicyManagerStub {
    public static IDevicePolicyManagerStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IDevicePolicyManagerStubStatic.class, null, false);
    }

    public static IDevicePolicyManagerStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IDevicePolicyManagerStubStatic.class, null, true);
    }

    public static IDevicePolicyManagerStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IDevicePolicyManagerStubContext.class, caller, false);
    }

    public static IDevicePolicyManagerStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IDevicePolicyManagerStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IDevicePolicyManagerStubContext.class);
    }
}
