package black.android.content.pm;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.content.pm.ApplicationInfo")
public interface ApplicationInfoNContext {
    @BFieldNotProcess
    String credentialEncryptedDataDir();
    @BFieldSetNotProcess
    void _set_credentialEncryptedDataDir(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_credentialEncryptedDataDir();
    @BFieldNotProcess
    String credentialProtectedDataDir();
    @BFieldSetNotProcess
    void _set_credentialProtectedDataDir(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_credentialProtectedDataDir();
    @BFieldNotProcess
    String deviceEncryptedDataDir();
    @BFieldSetNotProcess
    void _set_deviceEncryptedDataDir(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_deviceEncryptedDataDir();
    @BFieldNotProcess
    String deviceProtectedDataDir();
    @BFieldSetNotProcess
    void _set_deviceProtectedDataDir(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_deviceProtectedDataDir();
}
