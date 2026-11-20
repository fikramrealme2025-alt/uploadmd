package black.com.android.internal.os;

public class BRIVibratorServiceStub {
    public static IVibratorServiceStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IVibratorServiceStubStatic.class, null, false);
    }

    public static IVibratorServiceStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IVibratorServiceStubStatic.class, null, true);
    }

    public static IVibratorServiceStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IVibratorServiceStubContext.class, caller, false);
    }

    public static IVibratorServiceStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IVibratorServiceStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IVibratorServiceStubContext.class);
    }
}
