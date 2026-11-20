package black.android.content.res;

public class BRAssetManager {
    public static AssetManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(AssetManagerStatic.class, null, false);
    }

    public static AssetManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(AssetManagerStatic.class, null, true);
    }

    public static AssetManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(AssetManagerContext.class, caller, false);
    }

    public static AssetManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(AssetManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(AssetManagerContext.class);
    }
}
