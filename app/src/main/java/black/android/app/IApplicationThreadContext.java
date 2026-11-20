package black.android.app;

import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import java.util.List;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BMethod;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.app.IApplicationThread")
public interface IApplicationThreadContext {
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_scheduleBindService(IBinder IBinder0, Intent Intent1, boolean boolean2);
    Void scheduleBindService(IBinder IBinder0, Intent Intent1, boolean boolean2);
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_scheduleCreateService(IBinder IBinder0, ServiceInfo ServiceInfo1);
    Void scheduleCreateService(IBinder IBinder0, ServiceInfo ServiceInfo1);
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_scheduleNewIntent(List List0, IBinder IBinder1);
    Void scheduleNewIntent(List List0, IBinder IBinder1);
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_scheduleServiceArgs(IBinder IBinder0, int int1, int int2, Intent Intent3);
    Void scheduleServiceArgs(IBinder IBinder0, int int1, int int2, Intent Intent3);
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_scheduleStopService(IBinder IBinder0);
    Void scheduleStopService(IBinder IBinder0);
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_scheduleUnbindService(IBinder IBinder0, Intent Intent1);
    Void scheduleUnbindService(IBinder IBinder0, Intent Intent1);
}
