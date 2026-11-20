package black.android.app;

import android.graphics.drawable.Icon;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.app.Notification")
public interface NotificationMContext {
    @BFieldNotProcess
    Icon mLargeIcon();
    @BFieldSetNotProcess
    void _set_mLargeIcon(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mLargeIcon();
    @BFieldNotProcess
    Icon mSmallIcon();
    @BFieldSetNotProcess
    void _set_mSmallIcon(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mSmallIcon();
}
