package black.android.content.pm;

import android.graphics.Bitmap;
import android.net.Uri;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.content.pm.PackageInstaller$SessionInfo")
public interface PackageInstallerSessionInfoContext {
    @BFieldNotProcess
    Boolean active();
    @BFieldSetNotProcess
    void _set_active(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_active();
    @BFieldNotProcess
    Bitmap appIcon();
    @BFieldSetNotProcess
    void _set_appIcon(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_appIcon();
    @BFieldNotProcess
    CharSequence appLabel();
    @BFieldSetNotProcess
    void _set_appLabel(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_appLabel();
    @BFieldNotProcess
    String appPackageName();
    @BFieldSetNotProcess
    void _set_appPackageName(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_appPackageName();
    @BFieldNotProcess
    String installerPackageName();
    @BFieldSetNotProcess
    void _set_installerPackageName(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_installerPackageName();
    @BFieldNotProcess
    Integer mode();
    @BFieldSetNotProcess
    void _set_mode(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mode();
    @BFieldNotProcess
    Float progress();
    @BFieldSetNotProcess
    void _set_progress(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_progress();
    @BFieldNotProcess
    String resolvedBaseCodePath();
    @BFieldSetNotProcess
    void _set_resolvedBaseCodePath(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_resolvedBaseCodePath();
    @BFieldNotProcess
    Boolean sealed();
    @BFieldSetNotProcess
    void _set_sealed(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_sealed();
    @BFieldNotProcess
    Integer sessionId();
    @BFieldSetNotProcess
    void _set_sessionId(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_sessionId();
    @BFieldNotProcess
    Long sizeBytes();
    @BFieldSetNotProcess
    void _set_sizeBytes(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_sizeBytes();
}
