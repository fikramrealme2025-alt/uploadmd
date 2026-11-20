package black.android.app;

import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BMethod;
import top.niunaijun.blackreflection.annotation.BParamClassName;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.app.IActivityManager$ContentProviderHolder")
public interface IActivityManagerContentProviderHolderContext {
    @BFieldNotProcess
    ProviderInfo info();
    @BFieldSetNotProcess
    void _set_info(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_info();
    @BFieldNotProcess
    Boolean noReleaseNeeded();
    @BFieldSetNotProcess
    void _set_noReleaseNeeded(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_noReleaseNeeded();
    @BFieldNotProcess
    IInterface provider();
    @BFieldSetNotProcess
    void _set_provider(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_provider();
}
