package black.android.content;

import java.util.List;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.content.IntentFilter")
public interface IntentFilterContext {
    @BFieldNotProcess
    List<String> mActions();
    @BFieldSetNotProcess
    void _set_mActions(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mActions();
    @BFieldNotProcess
    List<String> mCategories();
    @BFieldSetNotProcess
    void _set_mCategories(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mCategories();
}
