package black.android.content.pm;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BMethod;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.content.pm.ApplicationInfo")
public interface ApplicationInfoPContext {
    @BFieldNotProcess
    String[] splitClassLoaderNames();
    @BFieldSetNotProcess
    void _set_splitClassLoaderNames(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_splitClassLoaderNames();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_setHiddenApiEnforcementPolicy(int int0);
    Void setHiddenApiEnforcementPolicy(int int0);
}
