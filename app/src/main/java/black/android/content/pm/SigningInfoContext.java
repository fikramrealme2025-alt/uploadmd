package black.android.content.pm;

import android.content.pm.PackageParser.SigningDetails;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.content.pm.SigningInfo")
public interface SigningInfoContext {
    @BFieldNotProcess
    SigningDetails mSigningDetails();
    @BFieldSetNotProcess
    void _set_mSigningDetails(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mSigningDetails();
}
