package black.android.content.pm;

public class BRPackageParserNougat {
    public static PackageParserNougatStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserNougatStatic.class, null, false);
    }

    public static PackageParserNougatStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserNougatStatic.class, null, true);
    }

    public static PackageParserNougatContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserNougatContext.class, caller, false);
    }

    public static PackageParserNougatContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserNougatContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(PackageParserNougatContext.class);
    }
}
