package black.android.os.mount;

public class BRIMountService {
    public static IMountServiceStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IMountServiceStatic.class, null, false);
    }

    public static IMountServiceStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IMountServiceStatic.class, null, true);
    }

    public static IMountServiceContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IMountServiceContext.class, caller, false);
    }

    public static IMountServiceContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IMountServiceContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IMountServiceContext.class);
    }
}
