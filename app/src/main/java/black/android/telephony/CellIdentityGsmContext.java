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

@BClassNameNotProcess("android.telephony.CellIdentityGsm")
public interface CellIdentityGsmContext {
    @BFieldNotProcess
    Integer mCid();
    @BFieldSetNotProcess
    void _set_mCid(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mCid();
    @BFieldNotProcess
    Integer mLac();
    @BFieldSetNotProcess
    void _set_mLac(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mLac();
    @BFieldNotProcess
    Integer mMcc();
    @BFieldSetNotProcess
    void _set_mMcc(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mMcc();
    @BFieldNotProcess
    Integer mMnc();
    @BFieldSetNotProcess
    void _set_mMnc(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mMnc();
}
