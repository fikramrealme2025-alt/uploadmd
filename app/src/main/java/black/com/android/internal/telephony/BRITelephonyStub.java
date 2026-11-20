package black.com.android.internal.telephony;

public class BRITelephonyStub {
    public static ITelephonyStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ITelephonyStubStatic.class, null, false);
    }

    public static ITelephonyStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ITelephonyStubStatic.class, null, true);
    }

    public static ITelephonyStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ITelephonyStubContext.class, caller, false);
    }

    public static ITelephonyStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ITelephonyStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ITelephonyStubContext.class);
    }
}
