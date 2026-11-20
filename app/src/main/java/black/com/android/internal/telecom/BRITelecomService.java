package black.com.android.internal.telecom;

public class BRITelecomService {
    public static ITelecomServiceStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ITelecomServiceStatic.class, null, false);
    }

    public static ITelecomServiceStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ITelecomServiceStatic.class, null, true);
    }

    public static ITelecomServiceContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ITelecomServiceContext.class, caller, false);
    }

    public static ITelecomServiceContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ITelecomServiceContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ITelecomServiceContext.class);
    }
}
