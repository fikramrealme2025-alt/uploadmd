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
public interface ParceledListSliceStatic {
    @BConstructorNotProcess
    Object _new();
    @BConstructorNotProcess
    Object _new(List<?> List0);
    @BFieldNotProcess
    Creator CREATOR();
    @BFieldSetNotProcess
    void _set_CREATOR(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_CREATOR();
}
