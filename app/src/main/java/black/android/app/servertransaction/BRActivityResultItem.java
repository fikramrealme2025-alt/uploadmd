package black.android.app.servertransaction;

public class BRActivityResultItem {
    public static ActivityResultItemStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityResultItemStatic.class, null, false);
    }

    public static ActivityResultItemStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityResultItemStatic.class, null, true);
    }

    public static ActivityResultItemContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityResultItemContext.class, caller, false);
    }

    public static ActivityResultItemContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ActivityResultItemContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ActivityResultItemContext.class);
    }
}
