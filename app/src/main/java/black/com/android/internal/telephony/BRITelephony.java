package black.com.android.internal.telephony;

public class BRITelephony {
    public static ITelephonyStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ITelephonyStatic.class, null, false);
    }

    public static ITelephonyStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ITelephonyStatic.class, null, true);
    }

    public static ITelephonyContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ITelephonyContext.class, caller, false);
    }

    public static ITelephonyContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ITelephonyContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ITelephonyContext.class);
    }
}
