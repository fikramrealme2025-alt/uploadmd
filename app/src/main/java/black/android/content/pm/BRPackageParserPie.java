package black.android.content.pm;

public class BRPackageParserPie {
    public static PackageParserPieStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserPieStatic.class, null, false);
    }

    public static PackageParserPieStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserPieStatic.class, null, true);
    }

    public static PackageParserPieContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserPieContext.class, caller, false);
    }

    public static PackageParserPieContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserPieContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(PackageParserPieContext.class);
    }
}
