package black.android.nfc;

public class BRINfcAdapterStub {
    public static INfcAdapterStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(INfcAdapterStubStatic.class, null, false);
    }

    public static INfcAdapterStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(INfcAdapterStubStatic.class, null, true);
    }

    public static INfcAdapterStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(INfcAdapterStubContext.class, caller, false);
    }

    public static INfcAdapterStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(INfcAdapterStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(INfcAdapterStubContext.class);
    }
}
