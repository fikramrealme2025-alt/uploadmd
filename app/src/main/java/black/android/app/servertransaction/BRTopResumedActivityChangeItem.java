package black.android.app.servertransaction;

public class BRTopResumedActivityChangeItem {
    public static TopResumedActivityChangeItemStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(TopResumedActivityChangeItemStatic.class, null, false);
    }

    public static TopResumedActivityChangeItemStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(TopResumedActivityChangeItemStatic.class, null, true);
    }

    public static TopResumedActivityChangeItemContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(TopResumedActivityChangeItemContext.class, caller, false);
    }

    public static TopResumedActivityChangeItemContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(TopResumedActivityChangeItemContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(TopResumedActivityChangeItemContext.class);
    }
}
