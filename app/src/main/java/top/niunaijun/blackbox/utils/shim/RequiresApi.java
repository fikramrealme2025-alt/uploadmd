package top.niunaijun.blackbox.utils.shim;

import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
public @interface RequiresApi {
    int value() default 1;
    int api() default 1;
}
