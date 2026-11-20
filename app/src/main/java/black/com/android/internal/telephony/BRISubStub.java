package black.com.android.internal.telephony;

public class BRISubStub {
    public static ISubStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ISubStubStatic.class, null, false);
    }

    public static ISubStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ISubStubStatic.class, null, true);
    }

    public static ISubStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ISubStubContext.class, caller, false);
    }

    public static ISubStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ISubStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ISubStubContext.class);
    }
}
