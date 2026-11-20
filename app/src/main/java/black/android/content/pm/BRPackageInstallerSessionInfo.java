package black.android.content.pm;

public class BRPackageInstallerSessionInfo {
    public static PackageInstallerSessionInfoStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageInstallerSessionInfoStatic.class, null, false);
    }

    public static PackageInstallerSessionInfoStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageInstallerSessionInfoStatic.class, null, true);
    }

    public static PackageInstallerSessionInfoContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageInstallerSessionInfoContext.class, caller, false);
    }

    public static PackageInstallerSessionInfoContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageInstallerSessionInfoContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(PackageInstallerSessionInfoContext.class);
    }
}
