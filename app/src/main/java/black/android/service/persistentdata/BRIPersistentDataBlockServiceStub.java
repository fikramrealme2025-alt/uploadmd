package black.android.service.persistentdata;

public class BRIPersistentDataBlockServiceStub {
    public static IPersistentDataBlockServiceStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IPersistentDataBlockServiceStubStatic.class, null, false);
    }

    public static IPersistentDataBlockServiceStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IPersistentDataBlockServiceStubStatic.class, null, true);
    }

    public static IPersistentDataBlockServiceStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IPersistentDataBlockServiceStubContext.class, caller, false);
    }

    public static IPersistentDataBlockServiceStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IPersistentDataBlockServiceStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IPersistentDataBlockServiceStubContext.class);
    }
}
