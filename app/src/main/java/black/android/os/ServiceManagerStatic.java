package black.android.os;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Map;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticField;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.os.ServiceManager")
public interface ServiceManagerStatic {
    @BFieldNotProcess
    Map<String, IBinder> sCache();
    @BFieldSetNotProcess
    void _set_sCache(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_sCache();
    @BFieldNotProcess
    IInterface sServiceManager();
    @BFieldSetNotProcess
    void _set_sServiceManager(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_sServiceManager();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_addService(String String0, IBinder IBinder1);
    Void addService(String String0, IBinder IBinder1);
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_checkService();
    IBinder checkService();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getIServiceManager();
    IInterface getIServiceManager();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getService(String name);
    IBinder getService(String name);
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_listServices();
    String[] listServices();
}
