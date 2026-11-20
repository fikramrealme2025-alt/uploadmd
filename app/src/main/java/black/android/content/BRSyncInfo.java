package black.android.content;

public class BRSyncInfo {
    public static SyncInfoStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(SyncInfoStatic.class, null, false);
    }

    public static SyncInfoStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(SyncInfoStatic.class, null, true);
    }

    public static SyncInfoContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SyncInfoContext.class, caller, false);
    }

    public static SyncInfoContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SyncInfoContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(SyncInfoContext.class);
    }
}
