package black.android.app;

import android.content.Intent;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.app.ServiceStartArgs")
public interface ServiceStartArgsContext {
    @BFieldNotProcess
    Intent args();
    @BFieldSetNotProcess
    void _set_args(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_args();
    @BFieldNotProcess
    Integer flags();
    @BFieldSetNotProcess
    void _set_flags(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_flags();
    @BFieldNotProcess
    Integer startId();
    @BFieldSetNotProcess
    void _set_startId(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_startId();
    @BFieldNotProcess
    Boolean taskRemoved();
    @BFieldSetNotProcess
    void _set_taskRemoved(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_taskRemoved();
}
