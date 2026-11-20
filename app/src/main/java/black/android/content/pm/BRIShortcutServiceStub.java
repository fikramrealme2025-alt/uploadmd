package black.android.content.pm;

public class BRIShortcutServiceStub {
    public static IShortcutServiceStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IShortcutServiceStubStatic.class, null, false);
    }

    public static IShortcutServiceStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IShortcutServiceStubStatic.class, null, true);
    }

    public static IShortcutServiceStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IShortcutServiceStubContext.class, caller, false);
    }

    public static IShortcutServiceStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IShortcutServiceStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IShortcutServiceStubContext.class);
    }
}
