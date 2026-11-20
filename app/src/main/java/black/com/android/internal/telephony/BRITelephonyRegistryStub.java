package black.com.android.internal.telephony;

public class BRITelephonyRegistryStub {
    public static ITelephonyRegistryStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ITelephonyRegistryStubStatic.class, null, false);
    }

    public static ITelephonyRegistryStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ITelephonyRegistryStubStatic.class, null, true);
    }

    public static ITelephonyRegistryStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ITelephonyRegistryStubContext.class, caller, false);
    }

    public static ITelephonyRegistryStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ITelephonyRegistryStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ITelephonyRegistryStubContext.class);
    }
}
