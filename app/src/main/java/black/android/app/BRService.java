package black.android.app;

public class BRService {
    public static ServiceStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ServiceStatic.class, null, false);
    }

    public static ServiceStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ServiceStatic.class, null, true);
    }

    public static ServiceContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ServiceContext.class, caller, false);
    }

    public static ServiceContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ServiceContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ServiceContext.class);
    }
}
