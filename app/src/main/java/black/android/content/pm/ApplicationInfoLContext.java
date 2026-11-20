package black.android.content.pm;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.content.pm.ApplicationInfo")
public interface ApplicationInfoLContext {
    @BFieldNotProcess
    String primaryCpuAbi();
    @BFieldSetNotProcess
    void _set_primaryCpuAbi(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_primaryCpuAbi();
    @BFieldNotProcess
    Integer privateFlags();
    @BFieldSetNotProcess
    void _set_privateFlags(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_privateFlags();
    @BFieldNotProcess
    String scanPublicSourceDir();
    @BFieldSetNotProcess
    void _set_scanPublicSourceDir(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_scanPublicSourceDir();
    @BFieldNotProcess
    String scanSourceDir();
    @BFieldSetNotProcess
    void _set_scanSourceDir(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_scanSourceDir();
    @BFieldNotProcess
    String secondaryCpuAbi();
    @BFieldSetNotProcess
    void _set_secondaryCpuAbi(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_secondaryCpuAbi();
    @BFieldNotProcess
    String secondaryNativeLibraryDir();
    @BFieldSetNotProcess
    void _set_secondaryNativeLibraryDir(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_secondaryNativeLibraryDir();
    @BFieldNotProcess
    String[] splitPublicSourceDirs();
    @BFieldSetNotProcess
    void _set_splitPublicSourceDirs(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_splitPublicSourceDirs();
    @BFieldNotProcess
    String[] splitSourceDirs();
    @BFieldSetNotProcess
    void _set_splitSourceDirs(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_splitSourceDirs();
}
