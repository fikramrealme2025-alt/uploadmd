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

@BClassNameNotProcess("android.location.LocationManager$GpsStatusListenerTransport")
public interface LocationManagerGpsStatusListenerTransportContext {
    @BFieldNotProcess
    Object mListener();
    @BFieldSetNotProcess
    void _set_mListener(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mListener();
    @BFieldNotProcess
    Object mNmeaListener();
    @BFieldSetNotProcess
    void _set_mNmeaListener(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mNmeaListener();
    @BFieldNotProcess
    Object this$0();
    @BFieldSetNotProcess
    void _set_this$0(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_this$0();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_onFirstFix(int int0);
    Void onFirstFix(int int0);
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_onGpsStarted();
    Void onGpsStarted();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_onNmeaReceived(long long0, String String1);
    Void onNmeaReceived(long long0, String String1);
}
