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

@BClassNameNotProcess("android.app.ActivityThread$H")
public interface ActivityThreadHStatic {
    @BFieldNotProcess
    Integer CREATE_SERVICE();
    @BFieldSetNotProcess
    void _set_CREATE_SERVICE(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_CREATE_SERVICE();
    @BFieldNotProcess
    Integer EXECUTE_TRANSACTION();
    @BFieldSetNotProcess
    void _set_EXECUTE_TRANSACTION(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_EXECUTE_TRANSACTION();
    @BFieldNotProcess
    Integer LAUNCH_ACTIVITY();
    @BFieldSetNotProcess
    void _set_LAUNCH_ACTIVITY(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_LAUNCH_ACTIVITY();
    @BFieldNotProcess
    Integer SCHEDULE_CRASH();
    @BFieldSetNotProcess
    void _set_SCHEDULE_CRASH(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_SCHEDULE_CRASH();
}
