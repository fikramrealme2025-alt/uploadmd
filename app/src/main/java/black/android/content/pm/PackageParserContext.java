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

@BClassNameNotProcess("android.content.pm.PackageParser")
public interface PackageParserContext {
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_collectCertificates(android.content.pm.PackageParser.Package p, int flags);
    Void collectCertificates(android.content.pm.PackageParser.Package p, int flags);
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_parsePackage(File File0, String String1, DisplayMetrics DisplayMetrics2, int int3);
    android.content.pm.PackageParser.Package parsePackage(File File0, String String1, DisplayMetrics DisplayMetrics2, int int3);
}
