package black.android.content.res;

import android.content.res.Configuration;
import android.util.DisplayMetrics;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BMethod;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.content.res.AssetManager")
public interface AssetManagerContext {
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_addAssetPath(String String0);
    Integer addAssetPath(String String0);
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getConfiguration();
    Configuration getConfiguration();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getDisplayMetrics();
    DisplayMetrics getDisplayMetrics();
}
