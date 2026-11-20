package black.android.content;

public class BRAttributionSourceState {
    public static AttributionSourceStateStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(AttributionSourceStateStatic.class, null, false);
    }

    public static AttributionSourceStateStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(AttributionSourceStateStatic.class, null, true);
    }

    public static AttributionSourceStateContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(AttributionSourceStateContext.class, caller, false);
    }

    public static AttributionSourceStateContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(AttributionSourceStateContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(AttributionSourceStateContext.class);
    }
}
