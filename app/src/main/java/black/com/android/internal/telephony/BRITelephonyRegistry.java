package black.com.android.internal.telephony;

public class BRITelephonyRegistry {
    public static ITelephonyRegistryStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ITelephonyRegistryStatic.class, null, false);
    }

    public static ITelephonyRegistryStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ITelephonyRegistryStatic.class, null, true);
    }

    public static ITelephonyRegistryContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ITelephonyRegistryContext.class, caller, false);
    }

    public static ITelephonyRegistryContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ITelephonyRegistryContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ITelephonyRegistryContext.class);
    }
}
