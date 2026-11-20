package black.android.content.pm;

public class BRPackageParserPermissionGroup {
    public static PackageParserPermissionGroupStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserPermissionGroupStatic.class, null, false);
    }

    public static PackageParserPermissionGroupStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserPermissionGroupStatic.class, null, true);
    }

    public static PackageParserPermissionGroupContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserPermissionGroupContext.class, caller, false);
    }

    public static PackageParserPermissionGroupContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserPermissionGroupContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(PackageParserPermissionGroupContext.class);
    }
}
