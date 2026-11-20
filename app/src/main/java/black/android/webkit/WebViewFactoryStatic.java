package black.android.webkit;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticField;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.webkit.WebViewFactory")
public interface WebViewFactoryStatic {
    @BFieldNotProcess
    Boolean sWebViewSupported();
    @BFieldSetNotProcess
    void _set_sWebViewSupported(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_sWebViewSupported();
    @BMethodCheckNotProcess
    java.lang.reflect.Method _check_getUpdateService();
    Object getUpdateService();
}
