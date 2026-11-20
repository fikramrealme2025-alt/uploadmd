package black.android.content;

public class BRClipboardManager {
    public static ClipboardManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ClipboardManagerStatic.class, null, false);
    }

    public static ClipboardManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ClipboardManagerStatic.class, null, true);
    }

    public static ClipboardManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ClipboardManagerContext.class, caller, false);
    }

    public static ClipboardManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ClipboardManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ClipboardManagerContext.class);
    }
}
