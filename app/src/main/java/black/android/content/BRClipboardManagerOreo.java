package black.android.content;

public class BRClipboardManagerOreo {
    public static ClipboardManagerOreoStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ClipboardManagerOreoStatic.class, null, false);
    }

    public static ClipboardManagerOreoStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ClipboardManagerOreoStatic.class, null, true);
    }

    public static ClipboardManagerOreoContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ClipboardManagerOreoContext.class, caller, false);
    }

    public static ClipboardManagerOreoContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ClipboardManagerOreoContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ClipboardManagerOreoContext.class);
    }
}
