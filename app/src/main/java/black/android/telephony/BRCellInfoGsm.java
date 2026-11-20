package black.android.telephony;

public class BRCellInfoGsm {
    public static CellInfoGsmStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(CellInfoGsmStatic.class, null, false);
    }

    public static CellInfoGsmStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(CellInfoGsmStatic.class, null, true);
    }

    public static CellInfoGsmContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(CellInfoGsmContext.class, caller, false);
    }

    public static CellInfoGsmContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(CellInfoGsmContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(CellInfoGsmContext.class);
    }
}
