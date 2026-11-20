package black.android.media;

public class BRIAudioServiceStub {
    public static IAudioServiceStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAudioServiceStubStatic.class, null, false);
    }

    public static IAudioServiceStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAudioServiceStubStatic.class, null, true);
    }

    public static IAudioServiceStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAudioServiceStubContext.class, caller, false);
    }

    public static IAudioServiceStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAudioServiceStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IAudioServiceStubContext.class);
    }
}
