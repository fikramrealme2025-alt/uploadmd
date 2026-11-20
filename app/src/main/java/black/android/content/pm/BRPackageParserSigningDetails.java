package black.android.content.pm;

public class BRPackageParserSigningDetails {
    public static PackageParserSigningDetailsStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserSigningDetailsStatic.class, null, false);
    }

    public static PackageParserSigningDetailsStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserSigningDetailsStatic.class, null, true);
    }

    public static PackageParserSigningDetailsContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserSigningDetailsContext.class, caller, false);
    }

    public static PackageParserSigningDetailsContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserSigningDetailsContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(PackageParserSigningDetailsContext.class);
    }
}
