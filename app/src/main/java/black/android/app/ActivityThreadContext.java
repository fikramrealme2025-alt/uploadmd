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
public interface ActivityThreadContext {
    @BFieldNotProcess
    Object mAppThread();
    @BFieldSetNotProcess
    void _set_mAppThread(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mAppThread();
    @BFieldNotProcess
    Map<IBinder, Object> mActivities();
    @BFieldSetNotProcess
    void _set_mActivities(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mActivities();
    @BFieldNotProcess
    Object mBoundApplication();
    @BFieldSetNotProcess
    void _set_mBoundApplication(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mBoundApplication();
    @BFieldNotProcess
    Handler mH();
    @BFieldSetNotProcess
    void _set_mH(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mH();
    @BFieldNotProcess
    Application mInitialApplication();
    @BFieldSetNotProcess
    void _set_mInitialApplication(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mInitialApplication();
    @BFieldNotProcess
    Instrumentation mInstrumentation();
    @BFieldSetNotProcess
    void _set_mInstrumentation(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mInstrumentation();
    @BFieldNotProcess
    Map<String, java.lang.ref.WeakReference<?>> mPackages();
    @BFieldSetNotProcess
    void _set_mPackages(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mPackages();
    @BFieldNotProcess
    Map<?, ?> mProviderMap();
    @BFieldSetNotProcess
    void _set_mProviderMap(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mProviderMap();
    @BFieldNotProcess
    Map<?, ?> mLocalProvidersByName();
    @BFieldSetNotProcess
    void _set_mLocalProvidersByName(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mLocalProvidersByName();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getApplicationThread();
    IBinder getApplicationThread();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getHandler();
    Handler getHandler();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getProcessName();
    String getProcessName();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getSystemContext();
    Object getSystemContext();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getActivityClient(IBinder token);
    Object getActivityClient(IBinder token);
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getLaunchingActivity(IBinder token);
    Object getLaunchingActivity(IBinder token);
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getPackageInfo(ApplicationInfo ai, @BParamClassName("android.content.res.CompatibilityInfo") Object compatInfo, int flags);
    Object getPackageInfo(ApplicationInfo ai, @BParamClassName("android.content.res.CompatibilityInfo") Object compatInfo, int flags);
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_performNewIntents(IBinder IBinder0, List List1);
    Void performNewIntents(IBinder IBinder0, List List1);
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_sendActivityResult(IBinder IBinder0, String String1, int int2, int int3, Intent Intent4);
    Void sendActivityResult(IBinder IBinder0, String String1, int int2, int int3, Intent Intent4);
}
