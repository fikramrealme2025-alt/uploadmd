package black.android.view;

public class BRIGraphicsStats {
    public static IGraphicsStatsStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IGraphicsStatsStatic.class, null, false);
    }

    public static IGraphicsStatsStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IGraphicsStatsStatic.class, null, true);
    }

    public static IGraphicsStatsContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IGraphicsStatsContext.class, caller, false);
    }

    public static IGraphicsStatsContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IGraphicsStatsContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IGraphicsStatsContext.class);
    }
}
