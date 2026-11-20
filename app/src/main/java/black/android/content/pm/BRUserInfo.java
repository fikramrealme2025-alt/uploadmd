package black.android.content.pm;

public class BRUserInfo {
    public static UserInfoStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(UserInfoStatic.class, null, false);
    }

    public static UserInfoStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(UserInfoStatic.class, null, true);
    }

    public static UserInfoContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(UserInfoContext.class, caller, false);
    }

    public static UserInfoContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(UserInfoContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(UserInfoContext.class);
    }
}
