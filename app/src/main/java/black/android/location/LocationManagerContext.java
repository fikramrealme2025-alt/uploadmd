package black.android.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.IInterface;
import java.util.HashMap;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BMethod;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.location.LocationManager")
public interface LocationManagerContext {
    @BFieldNotProcess
    HashMap mGnssNmeaListeners();
    @BFieldSetNotProcess
    void _set_mGnssNmeaListeners(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mGnssNmeaListeners();
    @BFieldNotProcess
    HashMap mGnssStatusListeners();
    @BFieldSetNotProcess
    void _set_mGnssStatusListeners(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mGnssStatusListeners();
    @BFieldNotProcess
    HashMap mGpsNmeaListeners();
    @BFieldSetNotProcess
    void _set_mGpsNmeaListeners(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mGpsNmeaListeners();
    @BFieldNotProcess
    HashMap mGpsStatusListeners();
    @BFieldSetNotProcess
    void _set_mGpsStatusListeners(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mGpsStatusListeners();
    @BFieldNotProcess
    HashMap mListeners();
    @BFieldSetNotProcess
    void _set_mListeners(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mListeners();
    @BFieldNotProcess
    HashMap mNmeaListeners();
    @BFieldSetNotProcess
    void _set_mNmeaListeners(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mNmeaListeners();
    @BFieldNotProcess
    IInterface mService();
    @BFieldSetNotProcess
    void _set_mService(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mService();
}
