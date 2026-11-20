package black.android.content.pm;

public class BRPackageInstaller {
    public static PackageInstallerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageInstallerStatic.class, null, false);
    }

    public static PackageInstallerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageInstallerStatic.class, null, true);
    }

    public static PackageInstallerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageInstallerContext.class, caller, false);
    }

    public static PackageInstallerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageInstallerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(PackageInstallerContext.class);
    }
}
