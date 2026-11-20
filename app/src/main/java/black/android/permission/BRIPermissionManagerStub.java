package black.android.permission;

public class BRIPermissionManagerStub {
    public static IPermissionManagerStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IPermissionManagerStubStatic.class, null, false);
    }

    public static IPermissionManagerStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IPermissionManagerStubStatic.class, null, true);
    }

    public static IPermissionManagerStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IPermissionManagerStubContext.class, caller, false);
    }

    public static IPermissionManagerStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IPermissionManagerStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IPermissionManagerStubContext.class);
    }
}
