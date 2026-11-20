package black.android.telephony;

public class BRSmsManager {
    public static SmsManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(SmsManagerStatic.class, null, false);
    }

    public static SmsManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(SmsManagerStatic.class, null, true);
    }

    public static SmsManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SmsManagerContext.class, caller, false);
    }

    public static SmsManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SmsManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(SmsManagerContext.class);
    }
}
