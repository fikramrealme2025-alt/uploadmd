package black.android.content;

public class BRSyncAdapterTypeN {
    public static SyncAdapterTypeNStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(SyncAdapterTypeNStatic.class, null, false);
    }

    public static SyncAdapterTypeNStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(SyncAdapterTypeNStatic.class, null, true);
    }

    public static SyncAdapterTypeNContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SyncAdapterTypeNContext.class, caller, false);
    }

    public static SyncAdapterTypeNContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(SyncAdapterTypeNContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(SyncAdapterTypeNContext.class);
    }
}
