package black.android.content;

import android.accounts.Account;
import android.os.Bundle;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.content.SyncRequest")
public interface SyncRequestContext {
    @BFieldNotProcess
    Account mAccountToSync();
    @BFieldSetNotProcess
    void _set_mAccountToSync(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mAccountToSync();
    @BFieldNotProcess
    String mAuthority();
    @BFieldSetNotProcess
    void _set_mAuthority(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mAuthority();
    @BFieldNotProcess
    Bundle mExtras();
    @BFieldSetNotProcess
    void _set_mExtras(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mExtras();
    @BFieldNotProcess
    Boolean mIsPeriodic();
    @BFieldSetNotProcess
    void _set_mIsPeriodic(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mIsPeriodic();
    @BFieldNotProcess
    Long mSyncFlexTimeSecs();
    @BFieldSetNotProcess
    void _set_mSyncFlexTimeSecs(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mSyncFlexTimeSecs();
    @BFieldNotProcess
    Long mSyncRunTimeSecs();
    @BFieldSetNotProcess
    void _set_mSyncRunTimeSecs(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mSyncRunTimeSecs();
}
