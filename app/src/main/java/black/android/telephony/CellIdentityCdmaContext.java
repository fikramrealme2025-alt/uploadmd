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

@BClassNameNotProcess("android.telephony.CellIdentityCdma")
public interface CellIdentityCdmaContext {
    @BFieldNotProcess
    Integer mBasestationId();
    @BFieldSetNotProcess
    void _set_mBasestationId(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mBasestationId();
    @BFieldNotProcess
    Integer mNetworkId();
    @BFieldSetNotProcess
    void _set_mNetworkId(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mNetworkId();
    @BFieldNotProcess
    Integer mSystemId();
    @BFieldSetNotProcess
    void _set_mSystemId(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mSystemId();
}
