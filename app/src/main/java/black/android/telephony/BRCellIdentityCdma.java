package black.android.telephony;

public class BRCellIdentityCdma {
    public static CellIdentityCdmaStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(CellIdentityCdmaStatic.class, null, false);
    }

    public static CellIdentityCdmaStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(CellIdentityCdmaStatic.class, null, true);
    }

    public static CellIdentityCdmaContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(CellIdentityCdmaContext.class, caller, false);
    }

    public static CellIdentityCdmaContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(CellIdentityCdmaContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(CellIdentityCdmaContext.class);
    }
}
