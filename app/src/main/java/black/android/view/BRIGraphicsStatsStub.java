package black.android.view;

public class BRIGraphicsStatsStub {
    public static IGraphicsStatsStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IGraphicsStatsStubStatic.class, null, false);
    }

    public static IGraphicsStatsStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IGraphicsStatsStubStatic.class, null, true);
    }

    public static IGraphicsStatsStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IGraphicsStatsStubContext.class, caller, false);
    }

    public static IGraphicsStatsStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IGraphicsStatsStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IGraphicsStatsStubContext.class);
    }
}
