package black.android.app;

public class BRWallpaperManagerGlobals {
    public static WallpaperManagerGlobalsStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(WallpaperManagerGlobalsStatic.class, null, false);
    }

    public static WallpaperManagerGlobalsStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(WallpaperManagerGlobalsStatic.class, null, true);
    }

    public static WallpaperManagerGlobalsContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(WallpaperManagerGlobalsContext.class, caller, false);
    }

    public static WallpaperManagerGlobalsContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(WallpaperManagerGlobalsContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(WallpaperManagerGlobalsContext.class);
    }
}
