package black.android.content.pm;

public class BRParceledListSlice {
    public static ParceledListSliceStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ParceledListSliceStatic.class, null, false);
    }

    public static ParceledListSliceStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ParceledListSliceStatic.class, null, true);
    }

    public static ParceledListSliceContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ParceledListSliceContext.class, caller, false);
    }

    public static ParceledListSliceContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ParceledListSliceContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ParceledListSliceContext.class);
    }
}
