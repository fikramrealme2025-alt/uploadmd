package black.android.app.servertransaction;

import java.util.List;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.app.servertransaction.ActivityResultItem")
public interface ActivityResultItemContext {
    @BFieldNotProcess
    List mResultInfoList();
    @BFieldSetNotProcess
    void _set_mResultInfoList(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mResultInfoList();
}
