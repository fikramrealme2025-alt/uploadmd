package black.android.telephony;

public class BRCellSignalStrengthCdma {
    public static CellSignalStrengthCdmaStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(CellSignalStrengthCdmaStatic.class, null, false);
    }

    public static CellSignalStrengthCdmaStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(CellSignalStrengthCdmaStatic.class, null, true);
    }

    public static CellSignalStrengthCdmaContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(CellSignalStrengthCdmaContext.class, caller, false);
    }

    public static CellSignalStrengthCdmaContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(CellSignalStrengthCdmaContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(CellSignalStrengthCdmaContext.class);
    }
}
