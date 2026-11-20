package black.android.app.backup;

public class BRIBackupManager {
    public static IBackupManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IBackupManagerStatic.class, null, false);
    }

    public static IBackupManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IBackupManagerStatic.class, null, true);
    }

    public static IBackupManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IBackupManagerContext.class, caller, false);
    }

    public static IBackupManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IBackupManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IBackupManagerContext.class);
    }
}
