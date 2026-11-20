package black.android.content.pm;

public class BRPackageParserService {
    public static PackageParserServiceStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserServiceStatic.class, null, false);
    }

    public static PackageParserServiceStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserServiceStatic.class, null, true);
    }

    public static PackageParserServiceContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserServiceContext.class, caller, false);
    }

    public static PackageParserServiceContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserServiceContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(PackageParserServiceContext.class);
    }
}
