package black.android.location.provider;

import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BConstructorNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BMethodCheckNotProcess;

@BClassNameNotProcess("android.location.provider.ProviderProperties")
public interface ProviderPropertiesContext {
    @BFieldNotProcess
    Boolean mHasNetworkRequirement();
    @BFieldSetNotProcess
    void _set_mHasNetworkRequirement(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mHasNetworkRequirement();
    @BFieldNotProcess
    Boolean mHasSatelliteRequirement();
    @BFieldSetNotProcess
    void _set_mHasSatelliteRequirement(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mHasSatelliteRequirement();
    @BFieldNotProcess
    Boolean mHasCellRequirement();
    @BFieldSetNotProcess
    void _set_mHasCellRequirement(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mHasCellRequirement();
    @BFieldNotProcess
    Boolean mHasMonetaryCost();
    @BFieldSetNotProcess
    void _set_mHasMonetaryCost(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mHasMonetaryCost();
    @BFieldNotProcess
    Boolean mHasAltitudeSupport();
    @BFieldSetNotProcess
    void _set_mHasAltitudeSupport(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mHasAltitudeSupport();
    @BFieldNotProcess
    Boolean mHasSpeedSupport();
    @BFieldSetNotProcess
    void _set_mHasSpeedSupport(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mHasSpeedSupport();
    @BFieldNotProcess
    Boolean mHasBearingSupport();
    @BFieldSetNotProcess
    void _set_mHasBearingSupport(final Object value);
    @BFieldCheckNotProcess
    java.lang.reflect.Field _check_mHasBearingSupport();
}
