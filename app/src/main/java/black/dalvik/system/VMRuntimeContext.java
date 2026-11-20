package black.dalvik.system;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BMethod;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("dalvik.system.VMRuntime")
public interface VMRuntimeContext {
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_is64Bit();
    Boolean is64Bit();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_isJavaDebuggable();
    Boolean isJavaDebuggable();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_setTargetSdkVersion(int int0);
    Void setTargetSdkVersion(int int0);
}
