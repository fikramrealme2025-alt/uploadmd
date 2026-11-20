package black.android.app;

import java.util.List;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.app.NotificationChannelGroup")
public interface NotificationChannelGroupContext {
    @BFieldNotProcess
    List<android.app.NotificationChannel> mChannels();
    @BFieldSetNotProcess
    void _set_mChannels(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mChannels();
    @BFieldNotProcess
    String mId();
    @BFieldSetNotProcess
    void _set_mId(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mId();
}
