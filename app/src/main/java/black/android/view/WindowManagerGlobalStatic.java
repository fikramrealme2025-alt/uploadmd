package black.android.view;

import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.view.WindowManagerGlobal")
public interface WindowManagerGlobalStatic {
    @BFieldNotProcess
    Integer ADD_PERMISSION_DENIED();
    @BFieldSetNotProcess
    void _set_ADD_PERMISSION_DENIED(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_ADD_PERMISSION_DENIED();
    @BFieldNotProcess
    IInterface sWindowManagerService();
    @BFieldSetNotProcess
    void _set_sWindowManagerService(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_sWindowManagerService();
}
