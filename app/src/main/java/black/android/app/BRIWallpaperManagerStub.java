package black.android.app;

public class BRIWallpaperManagerStub {
    public static IWallpaperManagerStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IWallpaperManagerStubStatic.class, null, false);
    }

    public static IWallpaperManagerStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IWallpaperManagerStubStatic.class, null, true);
    }

    public static IWallpaperManagerStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IWallpaperManagerStubContext.class, caller, false);
    }

    public static IWallpaperManagerStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IWallpaperManagerStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IWallpaperManagerStubContext.class);
    }
}
