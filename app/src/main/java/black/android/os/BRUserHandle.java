package black.android.os;

public class BRUserHandle {
    public static UserHandleStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(UserHandleStatic.class, null, false);
    }

    public static UserHandleStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(UserHandleStatic.class, null, true);
    }

    public static UserHandleContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(UserHandleContext.class, caller, false);
    }

    public static UserHandleContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(UserHandleContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(UserHandleContext.class);
    }
}
