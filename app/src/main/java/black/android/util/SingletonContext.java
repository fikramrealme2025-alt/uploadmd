package black.android.util;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BMethod;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.util.Singleton")
public interface SingletonContext {
    @BFieldNotProcess
    Object mInstance();
    @BFieldSetNotProcess
    void _set_mInstance(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mInstance();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_get();
    Object get();
}
