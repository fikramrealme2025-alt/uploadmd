package black.android.telephony;

public class BRNeighboringCellInfo {
    public static NeighboringCellInfoStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(NeighboringCellInfoStatic.class, null, false);
    }

    public static NeighboringCellInfoStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(NeighboringCellInfoStatic.class, null, true);
    }

    public static NeighboringCellInfoContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(NeighboringCellInfoContext.class, caller, false);
    }

    public static NeighboringCellInfoContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(NeighboringCellInfoContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(NeighboringCellInfoContext.class);
    }
}
