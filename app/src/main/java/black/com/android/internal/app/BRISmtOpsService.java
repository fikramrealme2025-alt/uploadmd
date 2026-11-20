package black.com.android.internal.app;

public class BRISmtOpsService {
    public static ISmtOpsServiceStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ISmtOpsServiceStatic.class, null, false);
    }

    public static ISmtOpsServiceStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ISmtOpsServiceStatic.class, null, true);
    }

    public static ISmtOpsServiceContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ISmtOpsServiceContext.class, caller, false);
    }

    public static ISmtOpsServiceContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ISmtOpsServiceContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ISmtOpsServiceContext.class);
    }
}
