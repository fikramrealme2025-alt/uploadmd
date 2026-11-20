package black.android.content.pm;

public class BRPackageParserPermission {
    public static PackageParserPermissionStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserPermissionStatic.class, null, false);
    }

    public static PackageParserPermissionStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserPermissionStatic.class, null, true);
    }

    public static PackageParserPermissionContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserPermissionContext.class, caller, false);
    }

    public static PackageParserPermissionContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserPermissionContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(PackageParserPermissionContext.class);
    }
}
