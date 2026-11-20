package black.android.os;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.os.Parcel")
public interface ParcelStatic {
    @BFieldNotProcess
    Integer VAL_PARCELABLE();
    @BFieldSetNotProcess
    void _set_VAL_PARCELABLE(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_VAL_PARCELABLE();
    @BFieldNotProcess
    Integer VAL_PARCELABLEARRAY();
    @BFieldSetNotProcess
    void _set_VAL_PARCELABLEARRAY(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_VAL_PARCELABLEARRAY();
}
