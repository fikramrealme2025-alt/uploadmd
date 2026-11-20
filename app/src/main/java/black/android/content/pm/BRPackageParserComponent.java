package black.android.content.pm;

public class BRPackageParserComponent {
    public static PackageParserComponentStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserComponentStatic.class, null, false);
    }

    public static PackageParserComponentStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserComponentStatic.class, null, true);
    }

    public static PackageParserComponentContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserComponentContext.class, caller, false);
    }

    public static PackageParserComponentContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserComponentContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(PackageParserComponentContext.class);
    }
}
