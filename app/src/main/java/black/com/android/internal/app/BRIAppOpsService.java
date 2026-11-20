package black.com.android.internal.app;

public class BRIAppOpsService {
    public static IAppOpsServiceStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAppOpsServiceStatic.class, null, false);
    }

    public static IAppOpsServiceStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAppOpsServiceStatic.class, null, true);
    }

    public static IAppOpsServiceContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAppOpsServiceContext.class, caller, false);
    }

    public static IAppOpsServiceContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAppOpsServiceContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IAppOpsServiceContext.class);
    }
}
