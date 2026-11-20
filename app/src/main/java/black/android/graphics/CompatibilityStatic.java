package black.android.graphics;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.graphics.Compatibility")
public interface CompatibilityStatic {
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_setTargetSdkVersion(int targetSdkVersion);
    Void setTargetSdkVersion(int targetSdkVersion);
}
