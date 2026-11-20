package black.com.android.internal.telephony;

public class BRIPhoneSubInfo {
    public static IPhoneSubInfoStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IPhoneSubInfoStatic.class, null, false);
    }

    public static IPhoneSubInfoStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IPhoneSubInfoStatic.class, null, true);
    }

    public static IPhoneSubInfoContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IPhoneSubInfoContext.class, caller, false);
    }

    public static IPhoneSubInfoContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IPhoneSubInfoContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IPhoneSubInfoContext.class);
    }
}
