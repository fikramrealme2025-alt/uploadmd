package black.android.view.accessibility;

public class BRIAccessibilityManager {
    public static IAccessibilityManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAccessibilityManagerStatic.class, null, false);
    }

    public static IAccessibilityManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAccessibilityManagerStatic.class, null, true);
    }

    public static IAccessibilityManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAccessibilityManagerContext.class, caller, false);
    }

    public static IAccessibilityManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAccessibilityManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IAccessibilityManagerContext.class);
    }
}
