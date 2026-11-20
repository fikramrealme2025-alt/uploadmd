package black.com.android.internal;

public class BRRstyleable {
    public static RstyleableStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(RstyleableStatic.class, null, false);
    }

    public static RstyleableStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(RstyleableStatic.class, null, true);
    }

    public static RstyleableContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(RstyleableContext.class, caller, false);
    }

    public static RstyleableContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(RstyleableContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(RstyleableContext.class);
    }
}
