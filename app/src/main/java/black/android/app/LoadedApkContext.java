package black.android.app;

import android.app.Application;
import android.app.IServiceConnection;
import android.app.Instrumentation;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IIntentReceiver;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.os.Handler;
import android.os.IInterface;
import java.io.File;
import java.lang.ref.WeakReference;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BMethod;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.app.LoadedApk")
public interface LoadedApkContext {
    @BFieldNotProcess
    Application mApplication();
    @BFieldSetNotProcess
    void _set_mApplication(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mApplication();
    @BFieldNotProcess
    ApplicationInfo mApplicationInfo();
    @BFieldSetNotProcess
    void _set_mApplicationInfo(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mApplicationInfo();
    @BFieldNotProcess
    File mCredentialProtectedDataDirFile();
    @BFieldSetNotProcess
    void _set_mCredentialProtectedDataDirFile(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mCredentialProtectedDataDirFile();
    @BFieldNotProcess
    String mDataDir();
    @BFieldSetNotProcess
    void _set_mDataDir(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mDataDir();
    @BFieldNotProcess
    File mDataDirFile();
    @BFieldSetNotProcess
    void _set_mDataDirFile(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mDataDirFile();
    @BFieldNotProcess
    File mDeviceProtectedDataDirFile();
    @BFieldSetNotProcess
    void _set_mDeviceProtectedDataDirFile(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mDeviceProtectedDataDirFile();
    @BFieldNotProcess
    String mLibDir();
    @BFieldSetNotProcess
    void _set_mLibDir(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mLibDir();
    @BFieldNotProcess
    Boolean mSecurityViolation();
    @BFieldSetNotProcess
    void _set_mSecurityViolation(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mSecurityViolation();
    @BFieldNotProcess
    Boolean mPackageName();
    @BFieldSetNotProcess
    void _set_mPackageName(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mPackageName();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getResources();
    Object getResources();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_forgetServiceDispatcher(Context Context0, ServiceConnection ServiceConnection1);
    IServiceConnection forgetServiceDispatcher(Context Context0, ServiceConnection ServiceConnection1);
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getClassLoader();
    ClassLoader getClassLoader();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getServiceDispatcher(ServiceConnection ServiceConnection0, Context Context1, Handler Handler2, int int3);
    IServiceConnection getServiceDispatcher(ServiceConnection ServiceConnection0, Context Context1, Handler Handler2, int int3);
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_makeApplication(boolean boolean0, Instrumentation Instrumentation1);
    Application makeApplication(boolean boolean0, Instrumentation Instrumentation1);
}
