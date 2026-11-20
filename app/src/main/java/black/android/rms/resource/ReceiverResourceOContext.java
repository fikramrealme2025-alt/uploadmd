package black.android.rms.resource;

import java.util.Map;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.rms.resource.ReceiverResource")
public interface ReceiverResourceOContext {
    @BFieldNotProcess
    Map<Integer, java.util.List<String>> mWhiteListMap();
    @BFieldSetNotProcess
    void _set_mWhiteListMap(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mWhiteListMap();
}
