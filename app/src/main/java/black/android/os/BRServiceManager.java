package black.android.os;

public class BRServiceManager {
    public static ServiceManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ServiceManagerStatic.class, null, false);
    }

    public static ServiceManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ServiceManagerStatic.class, null, true);
    }

    public static ServiceManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ServiceManagerContext.class, caller, false);
    }

    public static ServiceManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ServiceManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ServiceManagerContext.class);
    }
}
