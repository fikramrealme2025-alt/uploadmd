package black.android.os;

public class BRIDeviceIdentifiersPolicyService {
    public static IDeviceIdentifiersPolicyServiceStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IDeviceIdentifiersPolicyServiceStatic.class, null, false);
    }

    public static IDeviceIdentifiersPolicyServiceStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IDeviceIdentifiersPolicyServiceStatic.class, null, true);
    }

    public static IDeviceIdentifiersPolicyServiceContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IDeviceIdentifiersPolicyServiceContext.class, caller, false);
    }

    public static IDeviceIdentifiersPolicyServiceContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IDeviceIdentifiersPolicyServiceContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IDeviceIdentifiersPolicyServiceContext.class);
    }
}
