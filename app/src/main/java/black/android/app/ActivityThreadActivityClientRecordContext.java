package black.android.app;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.view.Window;
import java.util.List;
import java.util.Map;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BMethod;
import top.niunaijun.blackreflection.annotation.BParamClassName;
import top.niunaijun.blackreflection.annotation.BStaticField;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.app.ActivityThread$ActivityClientRecord")
public interface ActivityThreadActivityClientRecordContext {
    @BFieldNotProcess
    Activity activity();
    @BFieldSetNotProcess
    void _set_activity(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_activity();
    @BFieldNotProcess
    ActivityInfo activityInfo();
    @BFieldSetNotProcess
    void _set_activityInfo(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_activityInfo();
    @BFieldNotProcess
    Intent intent();
    @BFieldSetNotProcess
    void _set_intent(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_intent();
    @BFieldNotProcess
    Boolean isTopResumedActivity();
    @BFieldSetNotProcess
    void _set_isTopResumedActivity(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_isTopResumedActivity();
    @BFieldNotProcess
    IBinder token();
    @BFieldSetNotProcess
    void _set_token(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_token();
    @BFieldNotProcess
    Object packageInfo();
    @BFieldSetNotProcess
    void _set_packageInfo(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_packageInfo();
    @BFieldNotProcess
    Window window();
    @BFieldSetNotProcess
    void _set_window(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_window();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_toString();
    String toString();
    @BFieldNotProcess
    Boolean mPreserveWindow();
    @BFieldSetNotProcess
    void _set_mPreserveWindow(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mPreserveWindow();
}
