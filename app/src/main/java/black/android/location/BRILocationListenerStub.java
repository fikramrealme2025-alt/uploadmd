package black.android.location;

public class BRILocationListenerStub {
    public static ILocationListenerStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ILocationListenerStubStatic.class, null, false);
    }

    public static ILocationListenerStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ILocationListenerStubStatic.class, null, true);
    }

    public static ILocationListenerStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ILocationListenerStubContext.class, caller, false);
    }

    public static ILocationListenerStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ILocationListenerStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ILocationListenerStubContext.class);
    }
}
