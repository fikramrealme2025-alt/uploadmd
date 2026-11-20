package black.android.app;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticField;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.app.ActivityTaskManager")
public interface ActivityTaskManagerStatic {
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getService();
    Object getService();
    @BFieldNotProcess
    Object IActivityTaskManagerSingleton();
    @BFieldSetNotProcess
    void _set_IActivityTaskManagerSingleton(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_IActivityTaskManagerSingleton();
}
