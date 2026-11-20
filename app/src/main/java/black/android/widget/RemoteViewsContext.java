package black.android.widget;

import android.content.pm.ApplicationInfo;
import java.util.ArrayList;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.widget.RemoteViews")
public interface RemoteViewsContext {
    @BFieldNotProcess
    ArrayList<Object> mActions();
    @BFieldSetNotProcess
    void _set_mActions(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mActions();
    @BFieldNotProcess
    ApplicationInfo mApplication();
    @BFieldSetNotProcess
    void _set_mApplication(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mApplication();
    @BFieldNotProcess
    String mPackage();
    @BFieldSetNotProcess
    void _set_mPackage(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mPackage();
}
