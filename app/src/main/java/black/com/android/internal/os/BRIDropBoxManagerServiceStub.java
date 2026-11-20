package black.com.android.internal.os;

public class BRIDropBoxManagerServiceStub {
    public static IDropBoxManagerServiceStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IDropBoxManagerServiceStubStatic.class, null, false);
    }

    public static IDropBoxManagerServiceStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IDropBoxManagerServiceStubStatic.class, null, true);
    }

    public static IDropBoxManagerServiceStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IDropBoxManagerServiceStubContext.class, caller, false);
    }

    public static IDropBoxManagerServiceStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IDropBoxManagerServiceStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IDropBoxManagerServiceStubContext.class);
    }
}
