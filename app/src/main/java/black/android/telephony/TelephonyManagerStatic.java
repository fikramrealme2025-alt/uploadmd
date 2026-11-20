package black.android.telephony;

import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticField;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.telephony.TelephonyManager")
public interface TelephonyManagerStatic {
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getSubscriberInfoService();
    Object getSubscriberInfoService();
    @BFieldNotProcess
    Boolean sServiceHandleCacheEnabled();
    @BFieldSetNotProcess
    void _set_sServiceHandleCacheEnabled(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_sServiceHandleCacheEnabled();
    @BFieldNotProcess
    IInterface sIPhoneSubInfo();
    @BFieldSetNotProcess
    void _set_sIPhoneSubInfo(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_sIPhoneSubInfo();
}
