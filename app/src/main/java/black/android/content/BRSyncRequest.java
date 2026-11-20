package black.android.content;

public class BRSyncRequest {
    public static SyncRequestStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(SyncRequestStatic.class, null, false);
    }

    public static SyncRequestStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(SyncRequestStatic.class, null, true);
    }

    public static SyncRequestContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SyncRequestContext.class, caller, false);
    }

    public static SyncRequestContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SyncRequestContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(SyncRequestContext.class);
    }
}
