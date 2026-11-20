package black.android.app;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.app.ActivityManager")
public interface ActivityManagerStatic {
    @BFieldNotProcess
    Integer START_INTENT_NOT_RESOLVED();
    @BFieldSetNotProcess
    void _set_START_INTENT_NOT_RESOLVED(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_START_INTENT_NOT_RESOLVED();
    @BFieldNotProcess
    Integer START_NOT_CURRENT_USER_ACTIVITY();
    @BFieldSetNotProcess
    void _set_START_NOT_CURRENT_USER_ACTIVITY(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_START_NOT_CURRENT_USER_ACTIVITY();
    @BFieldNotProcess
    Integer START_SUCCESS();
    @BFieldSetNotProcess
    void _set_START_SUCCESS(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_START_SUCCESS();
    @BFieldNotProcess
    Integer START_TASK_TO_FRONT();
    @BFieldSetNotProcess
    void _set_START_TASK_TO_FRONT(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_START_TASK_TO_FRONT();
}
