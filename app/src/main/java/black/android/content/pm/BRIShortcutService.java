package black.android.content.pm;

public class BRIShortcutService {
    public static IShortcutServiceStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IShortcutServiceStatic.class, null, false);
    }

    public static IShortcutServiceStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IShortcutServiceStatic.class, null, true);
    }

    public static IShortcutServiceContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IShortcutServiceContext.class, caller, false);
    }

    public static IShortcutServiceContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IShortcutServiceContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IShortcutServiceContext.class);
    }
}
