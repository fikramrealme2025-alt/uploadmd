package black.com.android.internal.os;

public class BRIDropBoxManagerService {
    public static IDropBoxManagerServiceStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IDropBoxManagerServiceStatic.class, null, false);
    }

    public static IDropBoxManagerServiceStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IDropBoxManagerServiceStatic.class, null, true);
    }

    public static IDropBoxManagerServiceContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IDropBoxManagerServiceContext.class, caller, false);
    }

    public static IDropBoxManagerServiceContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IDropBoxManagerServiceContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IDropBoxManagerServiceContext.class);
    }
}
