package black.android.app;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.IBinder;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BMethod;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.app.Activity")
public interface ActivityContext {
    @BFieldNotProcess
    ActivityInfo mActivityInfo();
    @BFieldSetNotProcess
    void _set_mActivityInfo(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mActivityInfo();
    @BFieldNotProcess
    String mEmbeddedID();
    @BFieldSetNotProcess
    void _set_mEmbeddedID(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mEmbeddedID();
    @BFieldNotProcess
    Boolean mFinished();
    @BFieldSetNotProcess
    void _set_mFinished(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mFinished();
    @BFieldNotProcess
    android.app.Activity mParent();
    @BFieldSetNotProcess
    void _set_mParent(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mParent();
    @BFieldNotProcess
    Integer mResultCode();
    @BFieldSetNotProcess
    void _set_mResultCode(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mResultCode();
    @BFieldNotProcess
    Intent mResultData();
    @BFieldSetNotProcess
    void _set_mResultData(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mResultData();
    @BFieldNotProcess
    IBinder mToken();
    @BFieldSetNotProcess
    void _set_mToken(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mToken();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_onActivityResult(int int0, int int1, Intent Intent2);
    Void onActivityResult(int int0, int int1, Intent Intent2);
}
