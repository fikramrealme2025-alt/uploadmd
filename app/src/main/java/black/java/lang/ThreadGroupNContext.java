package black.java.lang;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("java.lang.ThreadGroup")
public interface ThreadGroupNContext {
    @BFieldNotProcess
    java.lang.ThreadGroup[] groups();
    @BFieldSetNotProcess
    void _set_groups(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_groups();
    @BFieldNotProcess
    Integer ngroups();
    @BFieldSetNotProcess
    void _set_ngroups(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_ngroups();
    @BFieldNotProcess
    java.lang.ThreadGroup parent();
    @BFieldSetNotProcess
    void _set_parent(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_parent();
}
