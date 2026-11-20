package black.android.content.pm;

public class BRApplicationInfoN {
    public static ApplicationInfoNStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ApplicationInfoNStatic.class, null, false);
    }

    public static ApplicationInfoNStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ApplicationInfoNStatic.class, null, true);
    }

    public static ApplicationInfoNContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ApplicationInfoNContext.class, caller, false);
    }

    public static ApplicationInfoNContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ApplicationInfoNContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ApplicationInfoNContext.class);
    }
}
