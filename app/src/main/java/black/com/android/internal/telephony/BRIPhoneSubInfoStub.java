package black.com.android.internal.telephony;

public class BRIPhoneSubInfoStub {
    public static IPhoneSubInfoStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IPhoneSubInfoStubStatic.class, null, false);
    }

    public static IPhoneSubInfoStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IPhoneSubInfoStubStatic.class, null, true);
    }

    public static IPhoneSubInfoStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IPhoneSubInfoStubContext.class, caller, false);
    }

    public static IPhoneSubInfoStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IPhoneSubInfoStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IPhoneSubInfoStubContext.class);
    }
}
