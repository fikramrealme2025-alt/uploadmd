package black.android.view;

public class BRSurfaceControl {
    public static SurfaceControlStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(SurfaceControlStatic.class, null, false);
    }

    public static SurfaceControlStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(SurfaceControlStatic.class, null, true);
    }

    public static SurfaceControlContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SurfaceControlContext.class, caller, false);
    }

    public static SurfaceControlContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SurfaceControlContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(SurfaceControlContext.class);
    }
}
