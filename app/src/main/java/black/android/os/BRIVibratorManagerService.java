package black.android.os;

public class BRIVibratorManagerService {
    public static IVibratorManagerServiceStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IVibratorManagerServiceStatic.class, null, false);
    }

    public static IVibratorManagerServiceStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IVibratorManagerServiceStatic.class, null, true);
    }

    public static IVibratorManagerServiceContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IVibratorManagerServiceContext.class, caller, false);
    }

    public static IVibratorManagerServiceContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IVibratorManagerServiceContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IVibratorManagerServiceContext.class);
    }
}
