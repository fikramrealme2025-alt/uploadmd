package black.android.media;

public class BRAudioManager {
    public static AudioManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(AudioManagerStatic.class, null, false);
    }

    public static AudioManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(AudioManagerStatic.class, null, true);
    }

    public static AudioManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(AudioManagerContext.class, caller, false);
    }

    public static AudioManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(AudioManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(AudioManagerContext.class);
    }
}
