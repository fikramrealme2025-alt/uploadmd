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

@BClassNameNotProcess("android.location.LocationManager$GnssStatusListenerTransport")
public interface LocationManagerListenerTransportContext {
    @BFieldNotProcess
    LocationListener mListener();
    @BFieldSetNotProcess
    void _set_mListener(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mListener();
    @BFieldNotProcess
    Object this$0();
    @BFieldSetNotProcess
    void _set_this$0(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_this$0();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_onLocationChanged(Location Location0);
    Void onLocationChanged(Location Location0);
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_onProviderDisabled(String String0);
    Void onProviderDisabled(String String0);
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_onProviderEnabled(String String0);
    Void onProviderEnabled(String String0);
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_onStatusChanged(String String0, int int1, Bundle Bundle2);
    Void onStatusChanged(String String0, int int1, Bundle Bundle2);
}
