package black.android.os;

public class BRIVibratorManagerServiceStub {
    public static IVibratorManagerServiceStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IVibratorManagerServiceStubStatic.class, null, false);
    }

    public static IVibratorManagerServiceStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IVibratorManagerServiceStubStatic.class, null, true);
    }

    public static IVibratorManagerServiceStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IVibratorManagerServiceStubContext.class, caller, false);
    }

    public static IVibratorManagerServiceStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IVibratorManagerServiceStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IVibratorManagerServiceStubContext.class);
    }
}
