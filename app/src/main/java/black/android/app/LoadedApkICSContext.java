package black.android.app;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.app.LoadedApk")
public interface LoadedApkICSContext {
    @BFieldNotProcess
    Object mCompatibilityInfo();
    @BFieldSetNotProcess
    void _set_mCompatibilityInfo(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mCompatibilityInfo();
}
