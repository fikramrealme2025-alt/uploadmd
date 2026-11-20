package black.android.net.wifi;

import android.net.wifi.SupplicantState;
import java.net.InetAddress;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.net.wifi.WifiInfo")
public interface WifiInfoContext {
    @BFieldNotProcess
    String mBSSID();
    @BFieldSetNotProcess
    void _set_mBSSID(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mBSSID();
    @BFieldNotProcess
    Integer mFrequency();
    @BFieldSetNotProcess
    void _set_mFrequency(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mFrequency();
    @BFieldNotProcess
    InetAddress mIpAddress();
    @BFieldSetNotProcess
    void _set_mIpAddress(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mIpAddress();
    @BFieldNotProcess
    Integer mLinkSpeed();
    @BFieldSetNotProcess
    void _set_mLinkSpeed(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mLinkSpeed();
    @BFieldNotProcess
    String mMacAddress();
    @BFieldSetNotProcess
    void _set_mMacAddress(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mMacAddress();
    @BFieldNotProcess
    Integer mNetworkId();
    @BFieldSetNotProcess
    void _set_mNetworkId(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mNetworkId();
    @BFieldNotProcess
    Integer mRssi();
    @BFieldSetNotProcess
    void _set_mRssi(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mRssi();
    @BFieldNotProcess
    String mSSID();
    @BFieldSetNotProcess
    void _set_mSSID(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mSSID();
    @BFieldNotProcess
    SupplicantState mSupplicantState();
    @BFieldSetNotProcess
    void _set_mSupplicantState(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mSupplicantState();
    @BFieldNotProcess
    Object mWifiSsid();
    @BFieldSetNotProcess
    void _set_mWifiSsid(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mWifiSsid();
}
