package black.android.content.pm;

public class BRPackageManager {
    public static PackageManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageManagerStatic.class, null, false);
    }

    public static PackageManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageManagerStatic.class, null, true);
    }

    public static PackageManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageManagerContext.class, caller, false);
    }

    public static PackageManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(PackageManagerContext.class);
    }
}
