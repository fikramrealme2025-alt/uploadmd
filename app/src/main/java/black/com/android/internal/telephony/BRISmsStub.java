package black.com.android.internal.telephony;

public class BRISmsStub {
    public static ISmsStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ISmsStubStatic.class, null, false);
    }

    public static ISmsStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ISmsStubStatic.class, null, true);
    }

    public static ISmsStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ISmsStubContext.class, caller, false);
    }

    public static ISmsStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ISmsStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ISmsStubContext.class);
    }
}
