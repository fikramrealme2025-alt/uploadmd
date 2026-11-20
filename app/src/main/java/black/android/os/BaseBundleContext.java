package black.android.os;

import android.os.Parcel;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.os.BaseBundle")
public interface BaseBundleContext {
    @BFieldNotProcess
    Parcel mParcelledData();
    @BFieldSetNotProcess
    void _set_mParcelledData(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mParcelledData();
}
