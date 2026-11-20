package black.android.app.servertransaction;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.app.servertransaction.TopResumedActivityChangeItem")
public interface TopResumedActivityChangeItemContext {
    @BFieldNotProcess
    Boolean mOnTop();
    @BFieldSetNotProcess
    void _set_mOnTop(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mOnTop();
}
