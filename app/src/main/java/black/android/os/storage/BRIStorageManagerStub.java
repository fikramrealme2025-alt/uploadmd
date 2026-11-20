package black.android.os.storage;

public class BRIStorageManagerStub {
    public static IStorageManagerStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IStorageManagerStubStatic.class, null, false);
    }

    public static IStorageManagerStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IStorageManagerStubStatic.class, null, true);
    }

    public static IStorageManagerStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IStorageManagerStubContext.class, caller, false);
    }

    public static IStorageManagerStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IStorageManagerStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IStorageManagerStubContext.class);
    }
}
