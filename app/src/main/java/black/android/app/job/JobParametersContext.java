package black.android.app.job;

import android.os.IBinder;
import android.os.PersistableBundle;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.app.job.JobParameters")
public interface JobParametersContext {
    @BFieldNotProcess
    IBinder callback();
    @BFieldSetNotProcess
    void _set_callback(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_callback();
    @BFieldNotProcess
    PersistableBundle extras();
    @BFieldSetNotProcess
    void _set_extras(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_extras();
    @BFieldNotProcess
    Integer jobId();
    @BFieldSetNotProcess
    void _set_jobId(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_jobId();
}
