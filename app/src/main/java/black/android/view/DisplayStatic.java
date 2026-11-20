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

@BClassNameNotProcess("android.view.Display")
public interface DisplayStatic {
    @BFieldNotProcess
    IInterface sWindowManager();
    @BFieldSetNotProcess
    void _set_sWindowManager(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_sWindowManager();
}
