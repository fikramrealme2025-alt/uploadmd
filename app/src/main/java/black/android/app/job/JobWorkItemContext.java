package black.android.app.job;

import android.content.Intent;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BMethod;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.app.job.JobWorkItem")
public interface JobWorkItemContext {
    @BFieldNotProcess
    Integer mDeliveryCount();
    @BFieldSetNotProcess
    void _set_mDeliveryCount(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mDeliveryCount();
    @BFieldNotProcess
    Object mGrants();
    @BFieldSetNotProcess
    void _set_mGrants(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mGrants();
    @BFieldNotProcess
    Integer mWorkId();
    @BFieldSetNotProcess
    void _set_mWorkId(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mWorkId();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getIntent();
    Intent getIntent();
}
