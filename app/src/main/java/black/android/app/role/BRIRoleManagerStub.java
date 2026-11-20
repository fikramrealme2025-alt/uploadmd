package black.android.app.role;

public class BRIRoleManagerStub {
    public static IRoleManagerStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IRoleManagerStubStatic.class, null, false);
    }

    public static IRoleManagerStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IRoleManagerStubStatic.class, null, true);
    }

    public static IRoleManagerStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IRoleManagerStubContext.class, caller, false);
    }

    public static IRoleManagerStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IRoleManagerStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IRoleManagerStubContext.class);
    }
}
