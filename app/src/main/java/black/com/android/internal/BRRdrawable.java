package black.com.android.internal;

public class BRRdrawable {
    public static RdrawableStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(RdrawableStatic.class, null, false);
    }

    public static RdrawableStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(RdrawableStatic.class, null, true);
    }

    public static RdrawableContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(RdrawableContext.class, caller, false);
    }

    public static RdrawableContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(RdrawableContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(RdrawableContext.class);
    }
}
