package black.com.android.internal.telephony;

public class BRISms {
    public static ISmsStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ISmsStatic.class, null, false);
    }

    public static ISmsStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ISmsStatic.class, null, true);
    }

    public static ISmsContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ISmsContext.class, caller, false);
    }

    public static ISmsContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ISmsContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ISmsContext.class);
    }
}
