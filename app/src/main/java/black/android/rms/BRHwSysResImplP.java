package black.android.rms;

public class BRHwSysResImplP {
    public static HwSysResImplPStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(HwSysResImplPStatic.class, null, false);
    }

    public static HwSysResImplPStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(HwSysResImplPStatic.class, null, true);
    }

    public static HwSysResImplPContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(HwSysResImplPContext.class, caller, false);
    }

    public static HwSysResImplPContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(HwSysResImplPContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(HwSysResImplPContext.class);
    }
}
