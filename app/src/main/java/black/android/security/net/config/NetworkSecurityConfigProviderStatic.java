package black.android.security.net.config;

import android.content.Context;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.security.net.config.NetworkSecurityConfigProvider")
public interface NetworkSecurityConfigProviderStatic {
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_install(Context Context0);
    Void install(Context Context0);
}
