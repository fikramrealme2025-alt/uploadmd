package black.android.content;

public class BRIntentSender {
    public static IntentSenderStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IntentSenderStatic.class, null, false);
    }

    public static IntentSenderStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IntentSenderStatic.class, null, true);
    }

    public static IntentSenderContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IntentSenderContext.class, caller, false);
    }

    public static IntentSenderContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IntentSenderContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IntentSenderContext.class);
    }
}
