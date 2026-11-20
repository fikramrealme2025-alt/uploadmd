package black.android.os;

public class BRBuild {
    public static BuildStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(BuildStatic.class, null, false);
    }

    public static BuildStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(BuildStatic.class, null, true);
    }

    public static BuildContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(BuildContext.class, caller, false);
    }

    public static BuildContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(BuildContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(BuildContext.class);
    }
}
