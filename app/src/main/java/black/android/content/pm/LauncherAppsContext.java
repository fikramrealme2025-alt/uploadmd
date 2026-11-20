package black.android.content.pm;

import android.content.pm.PackageManager;
import android.os.IInterface;
import android.os.UserManager;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.content.pm.LauncherApps")
public interface LauncherAppsContext {
    @BFieldNotProcess
    PackageManager mPm();
    @BFieldSetNotProcess
    void _set_mPm(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mPm();
    @BFieldNotProcess
    IInterface mService();
    @BFieldSetNotProcess
    void _set_mService(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mService();
    @BFieldNotProcess
    UserManager mUserManager();
    @BFieldSetNotProcess
    void _set_mUserManager(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mUserManager();
}
