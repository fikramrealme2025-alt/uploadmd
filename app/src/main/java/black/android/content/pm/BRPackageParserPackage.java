package black.android.content.pm;

public class BRPackageParserPackage {
    public static PackageParserPackageStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserPackageStatic.class, null, false);
    }

    public static PackageParserPackageStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserPackageStatic.class, null, true);
    }

    public static PackageParserPackageContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserPackageContext.class, caller, false);
    }

    public static PackageParserPackageContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserPackageContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(PackageParserPackageContext.class);
    }
}
