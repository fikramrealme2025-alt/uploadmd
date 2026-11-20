package black.android.content.pm;

public class BRPackageParserLollipop {
    public static PackageParserLollipopStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserLollipopStatic.class, null, false);
    }

    public static PackageParserLollipopStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserLollipopStatic.class, null, true);
    }

    public static PackageParserLollipopContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserLollipopContext.class, caller, false);
    }

    public static PackageParserLollipopContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserLollipopContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(PackageParserLollipopContext.class);
    }
}
