package black.android.media;

public class BRIAudioService {
    public static IAudioServiceStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAudioServiceStatic.class, null, false);
    }

    public static IAudioServiceStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAudioServiceStatic.class, null, true);
    }

    public static IAudioServiceContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAudioServiceContext.class, caller, false);
    }

    public static IAudioServiceContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAudioServiceContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IAudioServiceContext.class);
    }
}
