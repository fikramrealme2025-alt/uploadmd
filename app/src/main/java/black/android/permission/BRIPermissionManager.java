package black.android.permission;

public class BRIPermissionManager {
    public static IPermissionManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IPermissionManagerStatic.class, null, false);
    }

    public static IPermissionManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IPermissionManagerStatic.class, null, true);
    }

    public static IPermissionManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IPermissionManagerContext.class, caller, false);
    }

    public static IPermissionManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IPermissionManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IPermissionManagerContext.class);
    }
}
