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

@BClassNameNotProcess("android.content.pm.PackageInstaller$SessionParams")
public interface PackageInstallerSessionParamsMarshmallowContext {
    @BFieldNotProcess
    String abiOverride();
    @BFieldSetNotProcess
    void _set_abiOverride(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_abiOverride();
    @BFieldNotProcess
    Bitmap appIcon();
    @BFieldSetNotProcess
    void _set_appIcon(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_appIcon();
    @BFieldNotProcess
    Long appIconLastModified();
    @BFieldSetNotProcess
    void _set_appIconLastModified(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_appIconLastModified();
    @BFieldNotProcess
    String appLabel();
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
    String[] grantedRuntimePermissions();
    @BFieldSetNotProcess
    void _set_grantedRuntimePermissions(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_grantedRuntimePermissions();
    @BFieldNotProcess
    Integer installFlags();
    @BFieldSetNotProcess
    void _set_installFlags(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_installFlags();
    @BFieldNotProcess
    Integer installLocation();
    @BFieldSetNotProcess
    void _set_installLocation(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_installLocation();
    @BFieldNotProcess
    Integer mode();
    @BFieldSetNotProcess
    void _set_mode(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mode();
    @BFieldNotProcess
    Uri originatingUri();
    @BFieldSetNotProcess
    void _set_originatingUri(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_originatingUri();
    @BFieldNotProcess
    Uri referrerUri();
    @BFieldSetNotProcess
    void _set_referrerUri(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_referrerUri();
    @BFieldNotProcess
    Long sizeBytes();
    @BFieldSetNotProcess
    void _set_sizeBytes(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_sizeBytes();
    @BFieldNotProcess
    String volumeUuid();
    @BFieldSetNotProcess
    void _set_volumeUuid(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_volumeUuid();
}
