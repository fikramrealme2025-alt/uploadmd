package black.android.app;

public class BRInstrumentation {
    public static InstrumentationStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(InstrumentationStatic.class, null, false);
    }

    public static InstrumentationStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(InstrumentationStatic.class, null, true);
    }

    public static InstrumentationContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(InstrumentationContext.class, caller, false);
    }

    public static InstrumentationContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(InstrumentationContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(InstrumentationContext.class);
    }
}
