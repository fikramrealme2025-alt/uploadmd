package black.android.content.pm;

public class BRPackageUserState {
    public static PackageUserStateStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageUserStateStatic.class, null, false);
    }

    public static PackageUserStateStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageUserStateStatic.class, null, true);
    }

    public static PackageUserStateContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageUserStateContext.class, caller, false);
    }

    public static PackageUserStateContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(PackageUserStateContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(PackageUserStateContext.class);
    }
}
