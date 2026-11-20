package black.android.os.mount;

public class BRIMountServiceStub {
    public static IMountServiceStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IMountServiceStubStatic.class, null, false);
    }

    public static IMountServiceStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IMountServiceStubStatic.class, null, true);
    }

    public static IMountServiceStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IMountServiceStubContext.class, caller, false);
    }

    public static IMountServiceStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IMountServiceStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IMountServiceStubContext.class);
    }
}
