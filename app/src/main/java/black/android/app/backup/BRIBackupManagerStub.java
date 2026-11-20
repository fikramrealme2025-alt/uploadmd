package black.android.app.backup;

public class BRIBackupManagerStub {
    public static IBackupManagerStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IBackupManagerStubStatic.class, null, false);
    }

    public static IBackupManagerStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IBackupManagerStubStatic.class, null, true);
    }

    public static IBackupManagerStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IBackupManagerStubContext.class, caller, false);
    }

    public static IBackupManagerStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IBackupManagerStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IBackupManagerStubContext.class);
    }
}
