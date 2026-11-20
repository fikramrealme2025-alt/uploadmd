package black.android.content.pm;

public class BRSigningInfo {
    public static SigningInfoStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(SigningInfoStatic.class, null, false);
    }

    public static SigningInfoStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(SigningInfoStatic.class, null, true);
    }

    public static SigningInfoContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SigningInfoContext.class, caller, false);
    }

    public static SigningInfoContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SigningInfoContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(SigningInfoContext.class);
    }
}
