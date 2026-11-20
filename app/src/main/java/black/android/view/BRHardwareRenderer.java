package black.android.view;

public class BRHardwareRenderer {
    public static HardwareRendererStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(HardwareRendererStatic.class, null, false);
    }

    public static HardwareRendererStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(HardwareRendererStatic.class, null, true);
    }

    public static HardwareRendererContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(HardwareRendererContext.class, caller, false);
    }

    public static HardwareRendererContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(HardwareRendererContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(HardwareRendererContext.class);
    }
}
