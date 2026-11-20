package black.android.app;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BMethod;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.app.ContextImpl")
public interface ContextImplContext {
    @BFieldNotProcess
    String mBasePackageName();
    @BFieldSetNotProcess
    void _set_mBasePackageName(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mBasePackageName();
    @BFieldNotProcess
    ContentResolver mContentResolver();
    @BFieldSetNotProcess
    void _set_mContentResolver(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mContentResolver();
    @BFieldNotProcess
    Object mPackageInfo();
    @BFieldSetNotProcess
    void _set_mPackageInfo(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mPackageInfo();
    @BFieldNotProcess
    PackageManager mPackageManager();
    @BFieldSetNotProcess
    void _set_mPackageManager(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mPackageManager();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getReceiverRestrictedContext();
    Context getReceiverRestrictedContext();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_setOuterContext(Context Context0);
    Void setOuterContext(Context Context0);
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getAttributionSource();
    Object getAttributionSource();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getPackageManager();
    PackageManager getPackageManager();
}
