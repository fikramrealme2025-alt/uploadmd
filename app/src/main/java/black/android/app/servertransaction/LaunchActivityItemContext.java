package black.android.app.servertransaction;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.app.servertransaction.LaunchActivityItem")
public interface LaunchActivityItemContext {
    @BFieldNotProcess
    ActivityInfo mInfo();
    @BFieldSetNotProcess
    void _set_mInfo(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mInfo();
    @BFieldNotProcess
    Intent mIntent();
    @BFieldSetNotProcess
    void _set_mIntent(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mIntent();
}
