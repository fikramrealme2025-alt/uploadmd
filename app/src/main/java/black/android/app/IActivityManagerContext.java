package black.android.app;

import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BMethod;
import top.niunaijun.blackreflection.annotation.BParamClassName;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.app.IActivityManager")
public interface IActivityManagerContext {
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getTaskForActivity(IBinder IBinder0, boolean boolean1);
    Integer getTaskForActivity(IBinder IBinder0, boolean boolean1);
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_overridePendingTransition(IBinder IBinder0, String String1, int int2, int int3);
    Void overridePendingTransition(IBinder IBinder0, String String1, int int2, int int3);
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_setRequestedOrientation(IBinder IBinder0, int int1);
    Void setRequestedOrientation(IBinder IBinder0, int int1);
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_startActivities();
    Integer startActivities();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_startActivity(@BParamClassName("android.app.IApplicationThread") Object caller, String callingPackage, Intent intent, String resolvedType, IBinder resultTo, String resultWho, int requestCode, int startFlags, @BParamClassName("android.app.ProfilerInfo") Object profilerInfo, Bundle bOptions);
    Integer startActivity(@BParamClassName("android.app.IApplicationThread") Object caller, String callingPackage, Intent intent, String resolvedType, IBinder resultTo, String resultWho, int requestCode, int startFlags, @BParamClassName("android.app.ProfilerInfo") Object profilerInfo, Bundle bOptions);
}
