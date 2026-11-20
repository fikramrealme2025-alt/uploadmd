package black.com.android.internal.content;

public class BRNativeLibraryHelperHandle {
    public static NativeLibraryHelperHandleStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(NativeLibraryHelperHandleStatic.class, null, false);
    }

    public static NativeLibraryHelperHandleStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(NativeLibraryHelperHandleStatic.class, null, true);
    }

    public static NativeLibraryHelperHandleContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(NativeLibraryHelperHandleContext.class, caller, false);
    }

    public static NativeLibraryHelperHandleContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(NativeLibraryHelperHandleContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(NativeLibraryHelperHandleContext.class);
    }
}
