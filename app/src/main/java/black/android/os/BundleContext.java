package black.android.os;

import android.os.IBinder;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BMethod;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.os.Bundle")
public interface BundleContext {
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getIBinder(String String0);
    IBinder getIBinder(String String0);
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_putIBinder(String String0, IBinder IBinder1);
    Void putIBinder(String String0, IBinder IBinder1);
}
