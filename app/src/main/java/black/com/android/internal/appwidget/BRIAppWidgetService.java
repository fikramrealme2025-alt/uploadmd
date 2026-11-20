package black.com.android.internal.appwidget;

public class BRIAppWidgetService {
    public static IAppWidgetServiceStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAppWidgetServiceStatic.class, null, false);
    }

    public static IAppWidgetServiceStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(IAppWidgetServiceStatic.class, null, true);
    }

    public static IAppWidgetServiceContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAppWidgetServiceContext.class, caller, false);
    }

    public static IAppWidgetServiceContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(IAppWidgetServiceContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(IAppWidgetServiceContext.class);
    }
}
