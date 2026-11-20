package black.android.app;

public class BRClientTransactionHandler {
    public static ClientTransactionHandlerStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ClientTransactionHandlerStatic.class, null, false);
    }

    public static ClientTransactionHandlerStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ClientTransactionHandlerStatic.class, null, true);
    }

    public static ClientTransactionHandlerContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ClientTransactionHandlerContext.class, caller, false);
    }

    public static ClientTransactionHandlerContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ClientTransactionHandlerContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ClientTransactionHandlerContext.class);
    }
}
