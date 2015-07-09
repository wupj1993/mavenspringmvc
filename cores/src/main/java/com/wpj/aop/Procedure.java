/*
 * Copyright (c) 2015 - 7 - 8
 * ---7 :56:54
 * ---×÷Õß:ÎâÅà»ù
 * ---QQ:757671834
 */

package com.wpj.aop;

import java.lang.annotation.*;

/**
 * Procedure declaration of REST API.
 * @author horiga
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface Procedure {
	String description() default "";
}
