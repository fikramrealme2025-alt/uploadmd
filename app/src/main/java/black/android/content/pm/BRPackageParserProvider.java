package black.android.content.pm;

public class BRPackageParserProvider {
    public static PackageParserProviderStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserProviderStatic.class, null, false);
    }

    public static PackageParserProviderStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserProviderStatic.class, null, true);
    }

    public static PackageParserProviderContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserProviderContext.class, caller, false);
    }

    public static PackageParserProviderContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserProviderContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(PackageParserProviderContext.class);
    }
}
