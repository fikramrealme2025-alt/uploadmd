package black.android.content;

public class BRIClipboard {
    public static IClipboardStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IClipboardStatic.class, null, false);
    }

    public static IClipboardStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IClipboardStatic.class, null, true);
    }

    public static IClipboardContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IClipboardContext.class, caller, false);
    }

    public static IClipboardContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IClipboardContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IClipboardContext.class);
    }
}
