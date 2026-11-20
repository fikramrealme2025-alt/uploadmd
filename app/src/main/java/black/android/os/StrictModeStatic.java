package black.android.os;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticField;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.os.StrictMode")
public interface StrictModeStatic {
    @BFieldNotProcess
    Integer DETECT_VM_FILE_URI_EXPOSURE();
    @BFieldSetNotProcess
    void _set_DETECT_VM_FILE_URI_EXPOSURE(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_DETECT_VM_FILE_URI_EXPOSURE();
    @BFieldNotProcess
    Integer PENALTY_DEATH_ON_FILE_URI_EXPOSURE();
    @BFieldSetNotProcess
    void _set_PENALTY_DEATH_ON_FILE_URI_EXPOSURE(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_PENALTY_DEATH_ON_FILE_URI_EXPOSURE();
    @BFieldNotProcess
    Integer sVmPolicyMask();
    @BFieldSetNotProcess
    void _set_sVmPolicyMask(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_sVmPolicyMask();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_disableDeathOnFileUriExposure();
    Void disableDeathOnFileUriExposure();
}
