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

@BClassNameNotProcess("android.telephony.CellSignalStrengthCdma")
public interface CellSignalStrengthCdmaContext {
    @BFieldNotProcess
    Integer mCdmaDbm();
    @BFieldSetNotProcess
    void _set_mCdmaDbm(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mCdmaDbm();
    @BFieldNotProcess
    Integer mCdmaEcio();
    @BFieldSetNotProcess
    void _set_mCdmaEcio(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mCdmaEcio();
    @BFieldNotProcess
    Integer mEvdoDbm();
    @BFieldSetNotProcess
    void _set_mEvdoDbm(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mEvdoDbm();
    @BFieldNotProcess
    Integer mEvdoEcio();
    @BFieldSetNotProcess
    void _set_mEvdoEcio(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mEvdoEcio();
    @BFieldNotProcess
    Integer mEvdoSnr();
    @BFieldSetNotProcess
    void _set_mEvdoSnr(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mEvdoSnr();
}
