package black.android.net.wifi;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.net.wifi.WifiSsid")
public interface WifiSsidStatic {
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_createFromAsciiEncoded(String asciiEncoded);
    Object createFromAsciiEncoded(String asciiEncoded);
}
