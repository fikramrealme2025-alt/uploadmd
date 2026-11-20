package black.android.net;

import android.net.NetworkInfo.DetailedState;
import android.net.NetworkInfo.State;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.net.NetworkInfo")
public interface NetworkInfoStatic {
    @BConstructorNotProcess
    NetworkInfo _new(int int0, int int1, String String2, String String3);
    @BConstructorNotProcess
    NetworkInfo _new(int int0);
}
