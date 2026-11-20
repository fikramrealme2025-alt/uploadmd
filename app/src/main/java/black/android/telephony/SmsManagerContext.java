package black.android.telephony;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BMethod;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.telephony.SmsManager")
public interface SmsManagerContext {
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getAutoPersisting();
    Boolean getAutoPersisting();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_setAutoPersisting(boolean boolean0);
    Void setAutoPersisting(boolean boolean0);
}
