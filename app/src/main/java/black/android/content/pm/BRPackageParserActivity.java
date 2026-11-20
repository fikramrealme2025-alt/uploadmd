package black.android.content.pm;

public class BRPackageParserActivity {
    public static PackageParserActivityStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserActivityStatic.class, null, false);
    }

    public static PackageParserActivityStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserActivityStatic.class, null, true);
    }

    public static PackageParserActivityContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserActivityContext.class, caller, false);
    }

    public static PackageParserActivityContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserActivityContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(PackageParserActivityContext.class);
    }
}
