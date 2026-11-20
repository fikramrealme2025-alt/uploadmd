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
public interface VMRuntimeStatic {
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getCurrentInstructionSet();
    String getCurrentInstructionSet();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getRuntime();
    Object getRuntime();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_is64BitAbi(String String0);
    Boolean is64BitAbi(String String0);
}
