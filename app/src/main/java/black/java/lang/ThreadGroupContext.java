package black.java.lang;

import java.util.List;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("java.lang.ThreadGroup")
public interface ThreadGroupContext {
    @BFieldNotProcess
    List<java.lang.ThreadGroup> groups();
    @BFieldSetNotProcess
    void _set_groups(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_groups();
    @BFieldNotProcess
    java.lang.ThreadGroup parent();
    @BFieldSetNotProcess
    void _set_parent(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_parent();
}
