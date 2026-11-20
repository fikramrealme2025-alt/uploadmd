package black.android.content;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.content.AttributionSourceState")
public interface AttributionSourceStateContext {
    @BFieldNotProcess
    String packageName();
    @BFieldSetNotProcess
    void _set_packageName(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_packageName();
    @BFieldNotProcess
    Integer uid();
    @BFieldSetNotProcess
    void _set_uid(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_uid();
}
