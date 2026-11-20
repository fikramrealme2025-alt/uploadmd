package black.android.app;

import java.io.File;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.app.ContextImpl")
public interface ContextImplKitkatContext {
    @BFieldNotProcess
    Object mDisplayAdjustments();
    @BFieldSetNotProcess
    void _set_mDisplayAdjustments(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mDisplayAdjustments();
    @BFieldNotProcess
    File[] mExternalCacheDirs();
    @BFieldSetNotProcess
    void _set_mExternalCacheDirs(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mExternalCacheDirs();
    @BFieldNotProcess
    File[] mExternalFilesDirs();
    @BFieldSetNotProcess
    void _set_mExternalFilesDirs(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mExternalFilesDirs();
    @BFieldNotProcess
    String mOpPackageName();
    @BFieldSetNotProcess
    void _set_mOpPackageName(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mOpPackageName();
}
