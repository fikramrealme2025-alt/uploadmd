package black.android.os;

public class BRParcel {
    public static ParcelStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ParcelStatic.class, null, false);
    }

    public static ParcelStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ParcelStatic.class, null, true);
    }

    public static ParcelContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ParcelContext.class, caller, false);
    }

    public static ParcelContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ParcelContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ParcelContext.class);
    }
}
