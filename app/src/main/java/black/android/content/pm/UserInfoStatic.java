package black.android.content.pm;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BConstructor;
import top.niunaijun.blackreflection.annotation.BStaticField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.content.pm.UserInfo")
public interface UserInfoStatic {
    @BConstructorNotProcess
    Object _new(int id, String name, int flags);
    @BFieldNotProcess
    Integer FLAG_PRIMARY();
    @BFieldSetNotProcess
    void _set_FLAG_PRIMARY(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_FLAG_PRIMARY();
}
