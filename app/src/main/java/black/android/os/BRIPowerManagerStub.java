package black.android.os;

public class BRIPowerManagerStub {
    public static IPowerManagerStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IPowerManagerStubStatic.class, null, false);
    }

    public static IPowerManagerStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IPowerManagerStubStatic.class, null, true);
    }

    public static IPowerManagerStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IPowerManagerStubContext.class, caller, false);
    }

    public static IPowerManagerStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IPowerManagerStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IPowerManagerStubContext.class);
    }
}
