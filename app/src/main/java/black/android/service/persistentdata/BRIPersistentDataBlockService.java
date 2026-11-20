package black.android.service.persistentdata;

public class BRIPersistentDataBlockService {
    public static IPersistentDataBlockServiceStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IPersistentDataBlockServiceStatic.class, null, false);
    }

    public static IPersistentDataBlockServiceStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IPersistentDataBlockServiceStatic.class, null, true);
    }

    public static IPersistentDataBlockServiceContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IPersistentDataBlockServiceContext.class, caller, false);
    }

    public static IPersistentDataBlockServiceContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IPersistentDataBlockServiceContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IPersistentDataBlockServiceContext.class);
    }
}
