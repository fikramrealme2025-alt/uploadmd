package black.com.android.internal.os;

public class BRIVibratorService {
    public static IVibratorServiceStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IVibratorServiceStatic.class, null, false);
    }

    public static IVibratorServiceStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IVibratorServiceStatic.class, null, true);
    }

    public static IVibratorServiceContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IVibratorServiceContext.class, caller, false);
    }

    public static IVibratorServiceContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IVibratorServiceContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IVibratorServiceContext.class);
    }
}
