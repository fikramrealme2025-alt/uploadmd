package black.android.telephony;

import android.telephony.CellIdentityCdma;
import android.telephony.CellSignalStrengthCdma;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.telephony.CellInfoCdma")
public interface CellInfoCdmaContext {
    @BFieldNotProcess
    CellIdentityCdma mCellIdentityCdma();
    @BFieldSetNotProcess
    void _set_mCellIdentityCdma(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mCellIdentityCdma();
    @BFieldNotProcess
    CellSignalStrengthCdma mCellSignalStrengthCdma();
    @BFieldSetNotProcess
    void _set_mCellSignalStrengthCdma(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mCellSignalStrengthCdma();
}
