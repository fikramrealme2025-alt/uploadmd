package black.com.android.internal.telecom;

public class BRITelecomServiceStub {
    public static ITelecomServiceStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ITelecomServiceStubStatic.class, null, false);
    }

    public static ITelecomServiceStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ITelecomServiceStubStatic.class, null, true);
    }

    public static ITelecomServiceStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ITelecomServiceStubContext.class, caller, false);
    }

    public static ITelecomServiceStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ITelecomServiceStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ITelecomServiceStubContext.class);
    }
}
