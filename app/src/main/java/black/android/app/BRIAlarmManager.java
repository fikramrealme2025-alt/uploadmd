package black.android.app;

public class BRIAlarmManager {
    public static IAlarmManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAlarmManagerStatic.class, null, false);
    }

    public static IAlarmManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAlarmManagerStatic.class, null, true);
    }

    public static IAlarmManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAlarmManagerContext.class, caller, false);
    }

    public static IAlarmManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAlarmManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IAlarmManagerContext.class);
    }
}
