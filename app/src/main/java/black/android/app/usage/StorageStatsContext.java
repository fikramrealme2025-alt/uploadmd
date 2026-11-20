package black.android.app.usage;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.app.usage.StorageStats")
public interface StorageStatsContext {
    @BFieldNotProcess
    Long cacheBytes();
    @BFieldSetNotProcess
    void _set_cacheBytes(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_cacheBytes();
    @BFieldNotProcess
    Long codeBytes();
    @BFieldSetNotProcess
    void _set_codeBytes(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_codeBytes();
    @BFieldNotProcess
    Long dataBytes();
    @BFieldSetNotProcess
    void _set_dataBytes(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_dataBytes();
}
