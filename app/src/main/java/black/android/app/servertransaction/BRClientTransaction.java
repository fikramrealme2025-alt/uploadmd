package black.android.app.servertransaction;

public class BRClientTransaction {
    public static ClientTransactionStatic get() {
        return top.niunaijun.blackreflection.BlackReflection.create(ClientTransactionStatic.class, null, false);
    }

    public static ClientTransactionStatic getWithException() {
        return top.niunaijun.blackreflection.BlackReflection.create(ClientTransactionStatic.class, null, true);
    }

    public static ClientTransactionContext get(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ClientTransactionContext.class, caller, false);
    }

    public static ClientTransactionContext getWithException(final Object caller) {
        return top.niunaijun.blackreflection.BlackReflection.create(ClientTransactionContext.class, caller, true);
    }

    public static Class getRealClass() {
        return top.niunaijun.blackreflection.utils.ClassUtil.classReady(ClientTransactionContext.class);
    }
}
