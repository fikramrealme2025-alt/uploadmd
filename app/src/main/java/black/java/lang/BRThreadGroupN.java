package black.java.lang;

public class BRThreadGroupN {
    public static ThreadGroupNStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ThreadGroupNStatic.class, null, false);
    }

    public static ThreadGroupNStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ThreadGroupNStatic.class, null, true);
    }

    public static ThreadGroupNContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ThreadGroupNContext.class, caller, false);
    }

    public static ThreadGroupNContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ThreadGroupNContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ThreadGroupNContext.class);
    }
}
