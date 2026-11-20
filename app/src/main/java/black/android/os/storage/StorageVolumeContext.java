package black.android.os.storage;

import java.io.File;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.os.storage.StorageVolume")
public interface StorageVolumeContext {
    @BFieldNotProcess
    File mInternalPath();
    @BFieldSetNotProcess
    void _set_mInternalPath(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mInternalPath();
    @BFieldNotProcess
    File mPath();
    @BFieldSetNotProcess
    void _set_mPath(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mPath();
}
