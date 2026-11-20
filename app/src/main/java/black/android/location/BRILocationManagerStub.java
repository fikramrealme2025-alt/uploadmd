package black.android.location;

public class BRILocationManagerStub {
    public static ILocationManagerStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ILocationManagerStubStatic.class, null, false);
    }

    public static ILocationManagerStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ILocationManagerStubStatic.class, null, true);
    }

    public static ILocationManagerStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ILocationManagerStubContext.class, caller, false);
    }

    public static ILocationManagerStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ILocationManagerStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ILocationManagerStubContext.class);
    }
}
