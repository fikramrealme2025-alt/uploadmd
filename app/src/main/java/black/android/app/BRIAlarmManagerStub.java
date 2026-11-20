package black.android.app;

public class BRIAlarmManagerStub {
    public static IAlarmManagerStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAlarmManagerStubStatic.class, null, false);
    }

    public static IAlarmManagerStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAlarmManagerStubStatic.class, null, true);
    }

    public static IAlarmManagerStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAlarmManagerStubContext.class, caller, false);
    }

    public static IAlarmManagerStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAlarmManagerStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IAlarmManagerStubContext.class);
    }
}
