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

@BClassNameNotProcess("android.app.LoadedApk$ReceiverDispatcher")
public interface LoadedApkReceiverDispatcherContext {
    @BFieldNotProcess
    IIntentReceiver mIIntentReceiver();
    @BFieldSetNotProcess
    void _set_mIIntentReceiver(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mIIntentReceiver();
    @BFieldNotProcess
    BroadcastReceiver mReceiver();
    @BFieldSetNotProcess
    void _set_mReceiver(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mReceiver();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getIIntentReceiver();
    IInterface getIIntentReceiver();
}
