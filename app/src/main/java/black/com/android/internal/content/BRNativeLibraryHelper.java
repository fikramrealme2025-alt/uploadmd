package black.com.android.internal.content;

public class BRNativeLibraryHelper {
    public static NativeLibraryHelperStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(NativeLibraryHelperStatic.class, null, false);
    }

    public static NativeLibraryHelperStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(NativeLibraryHelperStatic.class, null, true);
    }

    public static NativeLibraryHelperContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(NativeLibraryHelperContext.class, caller, false);
    }

    public static NativeLibraryHelperContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(NativeLibraryHelperContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(NativeLibraryHelperContext.class);
    }
}
