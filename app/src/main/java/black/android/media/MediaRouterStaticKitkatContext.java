package black.android.media;

import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BStaticField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.media.MediaRouter$Static")
public interface MediaRouterStaticKitkatContext {
    @BFieldNotProcess
    IInterface mMediaRouterService();
    @BFieldSetNotProcess
    void _set_mMediaRouterService(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mMediaRouterService();
}
