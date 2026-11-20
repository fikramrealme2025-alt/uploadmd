package black.android.app;

public class BRActivityManagerOreo {
    public static ActivityManagerOreoStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityManagerOreoStatic.class, null, false);
    }

    public static ActivityManagerOreoStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityManagerOreoStatic.class, null, true);
    }

    public static ActivityManagerOreoContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityManagerOreoContext.class, caller, false);
    }

    public static ActivityManagerOreoContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityManagerOreoContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ActivityManagerOreoContext.class);
    }
}
