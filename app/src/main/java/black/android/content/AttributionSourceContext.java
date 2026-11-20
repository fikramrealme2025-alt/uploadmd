package black.android.content;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BMethod;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.content.AttributionSource")
public interface AttributionSourceContext {
    @BFieldNotProcess
    Object mAttributionSourceState();
    @BFieldSetNotProcess
    void _set_mAttributionSourceState(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mAttributionSourceState();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getNext();
    Object getNext();
}
