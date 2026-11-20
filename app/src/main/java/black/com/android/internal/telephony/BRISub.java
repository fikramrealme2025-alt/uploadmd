package black.com.android.internal.telephony;

public class BRISub {
    public static ISubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ISubStatic.class, null, false);
    }

    public static ISubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ISubStatic.class, null, true);
    }

    public static ISubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ISubContext.class, caller, false);
    }

    public static ISubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ISubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ISubContext.class);
    }
}
