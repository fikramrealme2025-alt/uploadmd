package me.weishu.reflection;

import android.content.Context;
import android.os.Build;

import java.lang.reflect.Method;

/** Pengganti FreeReflection.unseal: membuka hidden API lewat meta-reflection. */
public final class Reflection {
    private Reflection() {}

    public static int unseal(Context context) {
        if (Build.VERSION.SDK_INT < 28) {
            return 0;
        }
        try {
            Method forName = Class.class.getDeclaredMethod("forName", String.class);
            Method getDeclaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            Class<?> vmRuntimeClass = (Class<?>) forName.invoke(null, "dalvik.system.VMRuntime");
            Method getRuntime = (Method) getDeclaredMethod.invoke(vmRuntimeClass, "getRuntime", null);
            Method setExemptions = (Method) getDeclaredMethod.invoke(vmRuntimeClass, "setHiddenApiExemptions", new Class[]{String[].class});
            Object vmRuntime = getRuntime.invoke(null);
            setExemptions.invoke(vmRuntime, (Object) new String[]{"L"});
            return 0;
        } catch (Throwable e) {
            return -1;
        }
    }
}
