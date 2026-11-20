package black.android.app.role;

public class BRIRoleManager {
    public static IRoleManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IRoleManagerStatic.class, null, false);
    }

    public static IRoleManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IRoleManagerStatic.class, null, true);
    }

    public static IRoleManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IRoleManagerContext.class, caller, false);
    }

    public static IRoleManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IRoleManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IRoleManagerContext.class);
    }
}
