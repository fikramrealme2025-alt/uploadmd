package black.android.service.notification;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.service.notification.StatusBarNotification")
public interface StatusBarNotificationContext {
    @BFieldNotProcess
    Integer id();
    @BFieldSetNotProcess
    void _set_id(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_id();
    @BFieldNotProcess
    String opPkg();
    @BFieldSetNotProcess
    void _set_opPkg(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_opPkg();
    @BFieldNotProcess
    String pkg();
    @BFieldSetNotProcess
    void _set_pkg(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_pkg();
    @BFieldNotProcess
    String tag();
    @BFieldSetNotProcess
    void _set_tag(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_tag();
}
