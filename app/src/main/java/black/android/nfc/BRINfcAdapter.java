package black.android.nfc;

public class BRINfcAdapter {
    public static INfcAdapterStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(INfcAdapterStatic.class, null, false);
    }

    public static INfcAdapterStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(INfcAdapterStatic.class, null, true);
    }

    public static INfcAdapterContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(INfcAdapterContext.class, caller, false);
    }

    public static INfcAdapterContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(INfcAdapterContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(INfcAdapterContext.class);
    }
}
