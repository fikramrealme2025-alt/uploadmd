package black.com.android.internal.telephony;

public class BRIMms {
    public static IMmsStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IMmsStatic.class, null, false);
    }

    public static IMmsStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IMmsStatic.class, null, true);
    }

    public static IMmsContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IMmsContext.class, caller, false);
    }

    public static IMmsContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IMmsContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IMmsContext.class);
    }
}
