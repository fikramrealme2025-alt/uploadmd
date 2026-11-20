package black.android.os;

public class BRProcess {
    public static ProcessStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ProcessStatic.class, null, false);
    }

    public static ProcessStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ProcessStatic.class, null, true);
    }

    public static ProcessContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ProcessContext.class, caller, false);
    }

    public static ProcessContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ProcessContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ProcessContext.class);
    }
}
