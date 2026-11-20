package black.android.content.pm;

public class BRPackageParserMarshmallow {
    public static PackageParserMarshmallowStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserMarshmallowStatic.class, null, false);
    }

    public static PackageParserMarshmallowStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserMarshmallowStatic.class, null, true);
    }

    public static PackageParserMarshmallowContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserMarshmallowContext.class, caller, false);
    }

    public static PackageParserMarshmallowContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageParserMarshmallowContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(PackageParserMarshmallowContext.class);
    }
}
