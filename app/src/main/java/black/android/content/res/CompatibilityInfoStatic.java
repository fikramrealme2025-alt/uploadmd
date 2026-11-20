package black.android.content.res;

import android.content.pm.ApplicationInfo;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BStaticField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.content.res.CompatibilityInfo")
public interface CompatibilityInfoStatic {
    @BConstructorNotProcess
    CompatibilityInfo _new(ApplicationInfo ApplicationInfo0, int int1, int int2, boolean boolean3);
    @BConstructorNotProcess
    CompatibilityInfo _new(ApplicationInfo ApplicationInfo0, int int1, int int2, boolean boolean3, int int4);
    @BFieldNotProcess
    Object DEFAULT_COMPATIBILITY_INFO();
    @BFieldSetNotProcess
    void _set_DEFAULT_COMPATIBILITY_INFO(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_DEFAULT_COMPATIBILITY_INFO();
}
