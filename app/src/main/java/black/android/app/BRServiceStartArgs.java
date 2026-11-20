package black.android.app;

public class BRServiceStartArgs {
    public static ServiceStartArgsStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ServiceStartArgsStatic.class, null, false);
    }

    public static ServiceStartArgsStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ServiceStartArgsStatic.class, null, true);
    }

    public static ServiceStartArgsContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ServiceStartArgsContext.class, caller, false);
    }

    public static ServiceStartArgsContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ServiceStartArgsContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ServiceStartArgsContext.class);
    }
}
