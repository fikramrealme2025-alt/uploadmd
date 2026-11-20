package black.com.android.internal.telephony;

public class BRPhoneConstantsMtk {
    public static PhoneConstantsMtkStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(PhoneConstantsMtkStatic.class, null, false);
    }

    public static PhoneConstantsMtkStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(PhoneConstantsMtkStatic.class, null, true);
    }

    public static PhoneConstantsMtkContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PhoneConstantsMtkContext.class, caller, false);
    }

    public static PhoneConstantsMtkContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PhoneConstantsMtkContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(PhoneConstantsMtkContext.class);
    }
}
