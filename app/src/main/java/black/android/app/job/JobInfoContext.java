package black.android.app.job;

import android.content.ComponentName;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.app.job.JobInfo")
public interface JobInfoContext {
    @BFieldNotProcess
    Long flexMillis();
    @BFieldSetNotProcess
    void _set_flexMillis(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_flexMillis();
    @BFieldNotProcess
    Long intervalMillis();
    @BFieldSetNotProcess
    void _set_intervalMillis(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_intervalMillis();
    @BFieldNotProcess
    Integer jobId();
    @BFieldSetNotProcess
    void _set_jobId(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_jobId();
    @BFieldNotProcess
    ComponentName service();
    @BFieldSetNotProcess
    void _set_service(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_service();
}
