package black.android.location;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BMethod;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.location.LocationRequest")
public interface LocationRequestLContext {
    @BFieldNotProcess
    Boolean mHideFromAppOps();
    @BFieldSetNotProcess
    void _set_mHideFromAppOps(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mHideFromAppOps();
    @BFieldNotProcess
    String mProvider();
    @BFieldSetNotProcess
    void _set_mProvider(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mProvider();
    @BFieldNotProcess
    Object mWorkSource();
    @BFieldSetNotProcess
    void _set_mWorkSource(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mWorkSource();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getProvider();
    String getProvider();
}
