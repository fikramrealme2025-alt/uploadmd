package black.android.telephony;

import android.telephony.CellIdentityGsm;
import android.telephony.CellSignalStrengthGsm;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.telephony.CellInfoGsm")
public interface CellInfoGsmContext {
    @BFieldNotProcess
    CellIdentityGsm mCellIdentityGsm();
    @BFieldSetNotProcess
    void _set_mCellIdentityGsm(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mCellIdentityGsm();
    @BFieldNotProcess
    CellSignalStrengthGsm mCellSignalStrengthGsm();
    @BFieldSetNotProcess
    void _set_mCellSignalStrengthGsm(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mCellSignalStrengthGsm();
}
