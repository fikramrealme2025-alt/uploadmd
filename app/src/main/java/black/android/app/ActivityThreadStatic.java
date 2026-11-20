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

@BClassNameNotProcess("android.app.ActivityThread")
public interface ActivityThreadStatic {
    @BFieldNotProcess
    IInterface sPackageManager();
    @BFieldSetNotProcess
    void _set_sPackageManager(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_sPackageManager();
    @BFieldNotProcess
    IInterface sPermissionManager();
    @BFieldSetNotProcess
    void _set_sPermissionManager(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_sPermissionManager();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_currentActivityThread();
    Object currentActivityThread();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_currentApplication();
    Application currentApplication();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_currentPackageName();
    String currentPackageName();
}
