package black.android.ddm;

public class BRDdmHandleAppName {
    public static DdmHandleAppNameStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(DdmHandleAppNameStatic.class, null, false);
    }

    public static DdmHandleAppNameStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(DdmHandleAppNameStatic.class, null, true);
    }

    public static DdmHandleAppNameContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(DdmHandleAppNameContext.class, caller, false);
    }

    public static DdmHandleAppNameContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(DdmHandleAppNameContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(DdmHandleAppNameContext.class);
    }
}
