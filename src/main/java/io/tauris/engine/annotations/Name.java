package io.tauris.engine.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Ray Chaung
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Name {

    /**
     * 主名称
     * @return
     */
    String value();

    /**
     * 副名称
     * @return
     */
    String minor() default "";

    /**
     * 如果未指定副名称，优先选择preferred为true的同主名称插件
     * @return
     */
    boolean preferred() default false;
}
