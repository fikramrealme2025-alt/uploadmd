package black.android.telephony;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.telephony.CellSignalStrengthGsm")
public interface CellSignalStrengthGsmContext {
    @BFieldNotProcess
    Integer mBitErrorRate();
    @BFieldSetNotProcess
    void _set_mBitErrorRate(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mBitErrorRate();
    @BFieldNotProcess
    Integer mSignalStrength();
    @BFieldSetNotProcess
    void _set_mSignalStrength(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mSignalStrength();
}
