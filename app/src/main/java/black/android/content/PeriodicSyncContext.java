package black.android.content;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.content.PeriodicSync")
public interface PeriodicSyncContext {
    @BFieldNotProcess
    Long flexTime();
    @BFieldSetNotProcess
    void _set_flexTime(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_flexTime();
}
