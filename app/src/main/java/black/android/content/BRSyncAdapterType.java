package black.android.content;

public class BRSyncAdapterType {
    public static SyncAdapterTypeStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(SyncAdapterTypeStatic.class, null, false);
    }

    public static SyncAdapterTypeStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(SyncAdapterTypeStatic.class, null, true);
    }

    public static SyncAdapterTypeContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SyncAdapterTypeContext.class, caller, false);
    }

    public static SyncAdapterTypeContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SyncAdapterTypeContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(SyncAdapterTypeContext.class);
    }
}
