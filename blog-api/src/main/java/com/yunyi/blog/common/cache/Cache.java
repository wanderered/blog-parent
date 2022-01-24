package com.yunyi.blog.common.cache;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Cache {

    long expire() default 1 * 60 * 1000;  //过期时间，数据在内存中的时间

    String name() default "";  //缓存标识， 自定义缓存前缀表示

}
