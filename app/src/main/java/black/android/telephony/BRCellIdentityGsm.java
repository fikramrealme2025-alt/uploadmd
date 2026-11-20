package black.android.telephony;

public class BRCellIdentityGsm {
    public static CellIdentityGsmStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(CellIdentityGsmStatic.class, null, false);
    }

    public static CellIdentityGsmStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(CellIdentityGsmStatic.class, null, true);
    }

    public static CellIdentityGsmContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(CellIdentityGsmContext.class, caller, false);
    }

    public static CellIdentityGsmContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(CellIdentityGsmContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(CellIdentityGsmContext.class);
    }
}
