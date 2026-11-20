package black.android.content;

import android.os.Bundle;
import android.os.IBinder;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BMethod;
import top.niunaijun.blackreflection.annotation.BParamClassName;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.content.BroadcastReceiver$PendingResult")
public interface BroadcastReceiverPendingResultContext {
    @BFieldNotProcess
    Boolean mAbortBroadcast();
    @BFieldSetNotProcess
    void _set_mAbortBroadcast(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mAbortBroadcast();
    @BFieldNotProcess
    Boolean mFinished();
    @BFieldSetNotProcess
    void _set_mFinished(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mFinished();
    @BFieldNotProcess
    Boolean mInitialStickyHint();
    @BFieldSetNotProcess
    void _set_mInitialStickyHint(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mInitialStickyHint();
    @BFieldNotProcess
    Boolean mOrderedHint();
    @BFieldSetNotProcess
    void _set_mOrderedHint(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mOrderedHint();
    @BFieldNotProcess
    Integer mResultCode();
    @BFieldSetNotProcess
    void _set_mResultCode(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mResultCode();
    @BFieldNotProcess
    String mResultData();
    @BFieldSetNotProcess
    void _set_mResultData(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mResultData();
    @BFieldNotProcess
    Bundle mResultExtras();
    @BFieldSetNotProcess
    void _set_mResultExtras(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mResultExtras();
    @BFieldNotProcess
    Integer mSendingUser();
    @BFieldSetNotProcess
    void _set_mSendingUser(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mSendingUser();
    @BFieldNotProcess
    IBinder mToken();
    @BFieldSetNotProcess
    void _set_mToken(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mToken();
    @BFieldNotProcess
    Integer mType();
    @BFieldSetNotProcess
    void _set_mType(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mType();
}
