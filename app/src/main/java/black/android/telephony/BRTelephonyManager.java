package black.android.telephony;

public class BRTelephonyManager {
    public static TelephonyManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(TelephonyManagerStatic.class, null, false);
    }

    public static TelephonyManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(TelephonyManagerStatic.class, null, true);
    }

    public static TelephonyManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(TelephonyManagerContext.class, caller, false);
    }

    public static TelephonyManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(TelephonyManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(TelephonyManagerContext.class);
    }
}
