package com.sm.core.base.annotion;

import java.lang.annotation.*;

/**
 * Created by yj on 2018/4/15.
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface IPFilter {
    /**
     * 业务名称
     */
    String[] value() default "";
}
