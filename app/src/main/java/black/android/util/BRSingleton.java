package black.android.util;

public class BRSingleton {
    public static SingletonStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(SingletonStatic.class, null, false);
    }

    public static SingletonStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(SingletonStatic.class, null, true);
    }

    public static SingletonContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SingletonContext.class, caller, false);
    }

    public static SingletonContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SingletonContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(SingletonContext.class);
    }
}
