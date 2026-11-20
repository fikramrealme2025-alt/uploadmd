package black.android.content.pm;

import android.content.pm.PackageParser.Package;
import java.io.File;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BMethod;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.content.pm.PackageParser")
public interface PackageParserLollipop22Context {
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_collectCertificates(Package p, int flags);
    Void collectCertificates(Package p, int flags);
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_parsePackage(File File0, int int1);
    Package parsePackage(File File0, int int1);
}
