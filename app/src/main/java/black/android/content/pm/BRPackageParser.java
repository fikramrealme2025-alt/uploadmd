package black.android.content.pm;

public class BRPackageParser {
    public static PackageParserStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserStatic.class, null, false);
    }

    public static PackageParserStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserStatic.class, null, true);
    }

    public static PackageParserContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserContext.class, caller, false);
    }

    public static PackageParserContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(PackageParserContext.class);
    }
}
