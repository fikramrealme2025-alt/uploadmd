package black.android.app;

public class BRWallpaperManager {
    public static WallpaperManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(WallpaperManagerStatic.class, null, false);
    }

    public static WallpaperManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(WallpaperManagerStatic.class, null, true);
    }

    public static WallpaperManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(WallpaperManagerContext.class, caller, false);
    }

    public static WallpaperManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(WallpaperManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(WallpaperManagerContext.class);
    }
}
