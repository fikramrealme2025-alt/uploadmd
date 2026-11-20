package black.android.app;

public class BRIWallpaperManager {
    public static IWallpaperManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IWallpaperManagerStatic.class, null, false);
    }

    public static IWallpaperManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IWallpaperManagerStatic.class, null, true);
    }

    public static IWallpaperManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IWallpaperManagerContext.class, caller, false);
    }

    public static IWallpaperManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IWallpaperManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IWallpaperManagerContext.class);
    }
}
