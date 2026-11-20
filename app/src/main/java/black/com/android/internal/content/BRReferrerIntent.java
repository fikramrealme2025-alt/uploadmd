package black.com.android.internal.content;

public class BRReferrerIntent {
    public static ReferrerIntentStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ReferrerIntentStatic.class, null, false);
    }

    public static ReferrerIntentStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ReferrerIntentStatic.class, null, true);
    }

    public static ReferrerIntentContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ReferrerIntentContext.class, caller, false);
    }

    public static ReferrerIntentContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ReferrerIntentContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ReferrerIntentContext.class);
    }
}
