package black.com.android.internal.net;

import java.util.List;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("com.android.internal.net.VpnConfig")
public interface VpnConfigContext {
    @BFieldNotProcess
    String user();
    @BFieldSetNotProcess
    void _set_user(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_user();
    @BFieldNotProcess
    List<String> disallowedApplications();
    @BFieldSetNotProcess
    void _set_disallowedApplications(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_disallowedApplications();
    @BFieldNotProcess
    List<String> allowedApplications();
    @BFieldSetNotProcess
    void _set_allowedApplications(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_allowedApplications();
}
