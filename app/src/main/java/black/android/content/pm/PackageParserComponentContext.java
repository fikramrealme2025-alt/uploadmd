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

@BClassNameNotProcess("android.content.pm.PackageParser$Component")
public interface PackageParserComponentContext {
    @BFieldNotProcess
    String className();
    @BFieldSetNotProcess
    void _set_className(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_className();
    @BFieldNotProcess
    ComponentName componentName();
    @BFieldSetNotProcess
    void _set_componentName(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_componentName();
    @BFieldNotProcess
    List<android.content.IntentFilter> intents();
    @BFieldSetNotProcess
    void _set_intents(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_intents();
}
