package black.dalvik.system;

public class BRVMRuntime {
    public static VMRuntimeStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(VMRuntimeStatic.class, null, false);
    }

    public static VMRuntimeStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(VMRuntimeStatic.class, null, true);
    }

    public static VMRuntimeContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(VMRuntimeContext.class, caller, false);
    }

    public static VMRuntimeContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(VMRuntimeContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(VMRuntimeContext.class);
    }
}
