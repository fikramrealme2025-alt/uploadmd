package black.android.location;

import android.util.ArrayMap;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.location.LocationManager")
public interface LocationManagerQContext {
    @BFieldNotProcess
    ArrayMap mGnssNmeaListeners();
    @BFieldSetNotProcess
    void _set_mGnssNmeaListeners(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mGnssNmeaListeners();
    @BFieldNotProcess
    ArrayMap mGnssStatusListeners();
    @BFieldSetNotProcess
    void _set_mGnssStatusListeners(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mGnssStatusListeners();
    @BFieldNotProcess
    ArrayMap mGpsNmeaListeners();
    @BFieldSetNotProcess
    void _set_mGpsNmeaListeners(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mGpsNmeaListeners();
    @BFieldNotProcess
    ArrayMap mGpsStatusListeners();
    @BFieldSetNotProcess
    void _set_mGpsStatusListeners(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mGpsStatusListeners();
    @BFieldNotProcess
    ArrayMap mListeners();
    @BFieldSetNotProcess
    void _set_mListeners(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mListeners();
}
