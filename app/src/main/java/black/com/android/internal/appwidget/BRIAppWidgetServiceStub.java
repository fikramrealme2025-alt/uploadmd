package black.com.android.internal.appwidget;

public class BRIAppWidgetServiceStub {
    public static IAppWidgetServiceStubStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAppWidgetServiceStubStatic.class, null, false);
    }

    public static IAppWidgetServiceStubStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAppWidgetServiceStubStatic.class, null, true);
    }

    public static IAppWidgetServiceStubContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAppWidgetServiceStubContext.class, caller, false);
    }

    public static IAppWidgetServiceStubContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAppWidgetServiceStubContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IAppWidgetServiceStubContext.class);
    }
}
