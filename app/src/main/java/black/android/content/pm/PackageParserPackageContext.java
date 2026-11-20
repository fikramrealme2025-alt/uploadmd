package black.android.content.pm;

import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.DisplayMetrics;
import java.io.File;
import java.util.List;
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

@BClassNameNotProcess("android.content.pm.PackageParser$Package")
public interface PackageParserPackageContext {
    @BFieldNotProcess
    List activities();
    @BFieldSetNotProcess
    void _set_activities(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_activities();
    @BFieldNotProcess
    Bundle mAppMetaData();
    @BFieldSetNotProcess
    void _set_mAppMetaData(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mAppMetaData();
    @BFieldNotProcess
    String mSharedUserId();
    @BFieldSetNotProcess
    void _set_mSharedUserId(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mSharedUserId();
    @BFieldNotProcess
    Signature[] mSignatures();
    @BFieldSetNotProcess
    void _set_mSignatures(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mSignatures();
    @BFieldNotProcess
    Object mSigningDetails();
    @BFieldSetNotProcess
    void _set_mSigningDetails(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mSigningDetails();
    @BFieldNotProcess
    Integer mVersionCode();
    @BFieldSetNotProcess
    void _set_mVersionCode(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mVersionCode();
    @BFieldNotProcess
    String packageName();
    @BFieldSetNotProcess
    void _set_packageName(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_packageName();
    @BFieldNotProcess
    List permissionGroups();
    @BFieldSetNotProcess
    void _set_permissionGroups(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_permissionGroups();
    @BFieldNotProcess
    List permissions();
    @BFieldSetNotProcess
    void _set_permissions(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_permissions();
    @BFieldNotProcess
    List<String> protectedBroadcasts();
    @BFieldSetNotProcess
    void _set_protectedBroadcasts(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_protectedBroadcasts();
    @BFieldNotProcess
    List providers();
    @BFieldSetNotProcess
    void _set_providers(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_providers();
    @BFieldNotProcess
    List receivers();
    @BFieldSetNotProcess
    void _set_receivers(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_receivers();
    @BFieldNotProcess
    List<String> requestedPermissions();
    @BFieldSetNotProcess
    void _set_requestedPermissions(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_requestedPermissions();
    @BFieldNotProcess
    List services();
    @BFieldSetNotProcess
    void _set_services(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_services();
}
