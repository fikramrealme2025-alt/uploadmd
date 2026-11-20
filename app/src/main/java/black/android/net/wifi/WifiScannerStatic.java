package black.android.net.wifi;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.net.wifi.WifiScanner")
public interface WifiScannerStatic {
    @BFieldNotProcess
    String GET_AVAILABLE_CHANNELS_EXTRA();
    @BFieldSetNotProcess
    void _set_GET_AVAILABLE_CHANNELS_EXTRA(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_GET_AVAILABLE_CHANNELS_EXTRA();
}
