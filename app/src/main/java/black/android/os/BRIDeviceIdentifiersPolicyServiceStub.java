package black.android.os;

public class BRIDeviceIdentifiersPolicyServiceStub {
    public static IDeviceIdentifiersPolicyServiceStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IDeviceIdentifiersPolicyServiceStubStatic.class, null, false);
    }

    public static IDeviceIdentifiersPolicyServiceStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IDeviceIdentifiersPolicyServiceStubStatic.class, null, true);
    }

    public static IDeviceIdentifiersPolicyServiceStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IDeviceIdentifiersPolicyServiceStubContext.class, caller, false);
    }

    public static IDeviceIdentifiersPolicyServiceStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IDeviceIdentifiersPolicyServiceStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IDeviceIdentifiersPolicyServiceStubContext.class);
    }
}
