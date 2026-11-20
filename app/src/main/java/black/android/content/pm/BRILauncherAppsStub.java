package black.android.content.pm;

public class BRILauncherAppsStub {
    public static ILauncherAppsStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ILauncherAppsStubStatic.class, null, false);
    }

    public static ILauncherAppsStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ILauncherAppsStubStatic.class, null, true);
    }

    public static ILauncherAppsStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ILauncherAppsStubContext.class, caller, false);
    }

    public static ILauncherAppsStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ILauncherAppsStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ILauncherAppsStubContext.class);
    }
}
