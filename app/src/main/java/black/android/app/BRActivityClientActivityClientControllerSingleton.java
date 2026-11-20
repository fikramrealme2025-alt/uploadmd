package black.android.app;

public class BRActivityClientActivityClientControllerSingleton {
    public static ActivityClientActivityClientControllerSingletonStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityClientActivityClientControllerSingletonStatic.class, null, false);
    }

    public static ActivityClientActivityClientControllerSingletonStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityClientActivityClientControllerSingletonStatic.class, null, true);
    }

    public static ActivityClientActivityClientControllerSingletonContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityClientActivityClientControllerSingletonContext.class, caller, false);
    }

    public static ActivityClientActivityClientControllerSingletonContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityClientActivityClientControllerSingletonContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ActivityClientActivityClientControllerSingletonContext.class);
    }
}
