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
public interface NetworkInfoContext {
    @BFieldNotProcess
    DetailedState mDetailedState();
    @BFieldSetNotProcess
    void _set_mDetailedState(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mDetailedState();
    @BFieldNotProcess
    Boolean mIsAvailable();
    @BFieldSetNotProcess
    void _set_mIsAvailable(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mIsAvailable();
    @BFieldNotProcess
    Integer mNetworkType();
    @BFieldSetNotProcess
    void _set_mNetworkType(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mNetworkType();
    @BFieldNotProcess
    State mState();
    @BFieldSetNotProcess
    void _set_mState(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mState();
    @BFieldNotProcess
    String mTypeName();
    @BFieldSetNotProcess
    void _set_mTypeName(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mTypeName();
}
