package black.android.os;

public class BRHandler {
    public static HandlerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(HandlerStatic.class, null, false);
    }

    public static HandlerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(HandlerStatic.class, null, true);
    }

    public static HandlerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(HandlerContext.class, caller, false);
    }

    public static HandlerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(HandlerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(HandlerContext.class);
    }
}
