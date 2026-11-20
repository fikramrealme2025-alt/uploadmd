package black.android.telephony;

public class BRCellSignalStrengthGsm {
    public static CellSignalStrengthGsmStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(CellSignalStrengthGsmStatic.class, null, false);
    }

    public static CellSignalStrengthGsmStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(CellSignalStrengthGsmStatic.class, null, true);
    }

    public static CellSignalStrengthGsmContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(CellSignalStrengthGsmContext.class, caller, false);
    }

    public static CellSignalStrengthGsmContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(CellSignalStrengthGsmContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(CellSignalStrengthGsmContext.class);
    }
}
