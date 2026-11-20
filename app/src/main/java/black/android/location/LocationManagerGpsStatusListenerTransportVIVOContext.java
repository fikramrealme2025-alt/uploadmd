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
public interface LocationManagerGpsStatusListenerTransportVIVOContext {
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_onSvStatusChanged(int int0, int[] ints1, float[] floats2, float[] floats3, float[] floats4, int int5, int int6, int int7, long[] longs8);
    Void onSvStatusChanged(int int0, int[] ints1, float[] floats2, float[] floats3, float[] floats4, int int5, int int6, int int7, long[] longs8);
}
