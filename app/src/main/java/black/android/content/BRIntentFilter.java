package black.android.content;

public class BRIntentFilter {
    public static IntentFilterStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IntentFilterStatic.class, null, false);
    }

    public static IntentFilterStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IntentFilterStatic.class, null, true);
    }

    public static IntentFilterContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IntentFilterContext.class, caller, false);
    }

    public static IntentFilterContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IntentFilterContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IntentFilterContext.class);
    }
}
