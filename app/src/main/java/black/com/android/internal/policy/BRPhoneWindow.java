package black.com.android.internal.policy;

public class BRPhoneWindow {
    public static PhoneWindowStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(PhoneWindowStatic.class, null, false);
    }

    public static PhoneWindowStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(PhoneWindowStatic.class, null, true);
    }

    public static PhoneWindowContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PhoneWindowContext.class, caller, false);
    }

    public static PhoneWindowContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PhoneWindowContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(PhoneWindowContext.class);
    }
}
