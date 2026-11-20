package black.android.app;

public class BRSharedPreferencesImpl {
    public static SharedPreferencesImplStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(SharedPreferencesImplStatic.class, null, false);
    }

    public static SharedPreferencesImplStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(SharedPreferencesImplStatic.class, null, true);
    }

    public static SharedPreferencesImplContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SharedPreferencesImplContext.class, caller, false);
    }

    public static SharedPreferencesImplContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SharedPreferencesImplContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(SharedPreferencesImplContext.class);
    }
}
