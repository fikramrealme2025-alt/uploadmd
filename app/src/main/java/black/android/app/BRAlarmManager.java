package black.android.app;

public class BRAlarmManager {
    public static AlarmManagerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(AlarmManagerStatic.class, null, false);
    }

    public static AlarmManagerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(AlarmManagerStatic.class, null, true);
    }

    public static AlarmManagerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(AlarmManagerContext.class, caller, false);
    }

    public static AlarmManagerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(AlarmManagerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(AlarmManagerContext.class);
    }
}
