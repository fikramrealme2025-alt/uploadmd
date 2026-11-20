package black.android.telephony;

public class BRCellInfoCdma {
    public static CellInfoCdmaStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(CellInfoCdmaStatic.class, null, false);
    }

    public static CellInfoCdmaStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(CellInfoCdmaStatic.class, null, true);
    }

    public static CellInfoCdmaContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(CellInfoCdmaContext.class, caller, false);
    }

    public static CellInfoCdmaContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(CellInfoCdmaContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(CellInfoCdmaContext.class);
    }
}
