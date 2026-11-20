package black.com.android.internal.telephony;

public class BRIMmsStub {
    public static IMmsStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IMmsStubStatic.class, null, false);
    }

    public static IMmsStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IMmsStubStatic.class, null, true);
    }

    public static IMmsStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IMmsStubContext.class, caller, false);
    }

    public static IMmsStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IMmsStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IMmsStubContext.class);
    }
}
