package black.com.android.internal;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("com.android.internal.R$layout")
public interface RlayoutStatic {
    @BFieldNotProcess
    Integer resolver_list();
    @BFieldSetNotProcess
    void _set_resolver_list(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_resolver_list();
}
