package black.android.app;

import android.content.ComponentName;
import android.os.IBinder;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BMethod;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.app.IServiceConnection")
public interface IServiceConnectionOContext {
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_connected(ComponentName ComponentName0, IBinder IBinder1, boolean boolean2);
    Void connected(ComponentName ComponentName0, IBinder IBinder1, boolean boolean2);
}
