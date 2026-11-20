package black.android.app.admin;

public class BRIDevicePolicyManager {
    public static IDevicePolicyManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IDevicePolicyManagerStatic.class, null, false);
    }

    public static IDevicePolicyManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IDevicePolicyManagerStatic.class, null, true);
    }

    public static IDevicePolicyManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IDevicePolicyManagerContext.class, caller, false);
    }

    public static IDevicePolicyManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IDevicePolicyManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IDevicePolicyManagerContext.class);
    }
}
