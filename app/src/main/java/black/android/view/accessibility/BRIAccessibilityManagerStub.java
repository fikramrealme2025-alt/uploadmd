package black.android.view.accessibility;

public class BRIAccessibilityManagerStub {
    public static IAccessibilityManagerStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAccessibilityManagerStubStatic.class, null, false);
    }

    public static IAccessibilityManagerStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAccessibilityManagerStubStatic.class, null, true);
    }

    public static IAccessibilityManagerStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAccessibilityManagerStubContext.class, caller, false);
    }

    public static IAccessibilityManagerStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAccessibilityManagerStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IAccessibilityManagerStubContext.class);
    }
}
