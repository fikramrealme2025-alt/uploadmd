package black.java.lang;

public class BRThreadGroup {
    public static ThreadGroupStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ThreadGroupStatic.class, null, false);
    }

    public static ThreadGroupStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ThreadGroupStatic.class, null, true);
    }

    public static ThreadGroupContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ThreadGroupContext.class, caller, false);
    }

    public static ThreadGroupContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ThreadGroupContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ThreadGroupContext.class);
    }
}
