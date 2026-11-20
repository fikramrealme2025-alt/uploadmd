package black.android.view;

public class BRDisplayAdjustments {
    public static DisplayAdjustmentsStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(DisplayAdjustmentsStatic.class, null, false);
    }

    public static DisplayAdjustmentsStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(DisplayAdjustmentsStatic.class, null, true);
    }

    public static DisplayAdjustmentsContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(DisplayAdjustmentsContext.class, caller, false);
    }

    public static DisplayAdjustmentsContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(DisplayAdjustmentsContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(DisplayAdjustmentsContext.class);
    }
}
