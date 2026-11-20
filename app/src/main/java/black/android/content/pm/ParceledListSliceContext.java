package black.android.content.pm;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BMethod;
import top.niunaijun.blackreflection.annotation.BStaticField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.content.pm.ParceledListSlice")
public interface ParceledListSliceContext {
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_append(Object item);
    Boolean append(Object item);
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getList();
    List<?> getList();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_isLastSlice();
    Boolean isLastSlice();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_populateList();
    Parcelable populateList();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_setLastSlice(boolean b);
    Void setLastSlice(boolean b);
}
