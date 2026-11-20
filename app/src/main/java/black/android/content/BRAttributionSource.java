package black.android.content;

public class BRAttributionSource {
    public static AttributionSourceStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(AttributionSourceStatic.class, null, false);
    }

    public static AttributionSourceStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(AttributionSourceStatic.class, null, true);
    }

    public static AttributionSourceContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(AttributionSourceContext.class, caller, false);
    }

    public static AttributionSourceContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(AttributionSourceContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(AttributionSourceContext.class);
    }
}
