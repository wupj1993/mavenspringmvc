package com.wpj.work;/*
 * Copyright (c) 2015 骞?2 鏈?23 鏃?
 * 	      2 鏃?14 鍒? 56鍒?
 *               浣滆?咃細鍚村煿鍩?
 *               Q  Q锛?757671834
 * 	      It is not easy to meet each other in such a big world
 */

import org.junit.runners.model.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

import java.io.FileNotFoundException;

/**
 * Created by wpj on 2015/2/23.
 * 作者：吴培基
 */
public class MySpringJUnit4ClassRunner extends SpringJUnit4ClassRunner {
    static {
        try {
            Log4jConfigurer.initLogging("classpath:log4j.properties");
            System.out.println("log4j 加载成功了。。。");
        } catch (FileNotFoundException ex) {
            System.err.println("Cannot Initialize log4j");
        }
    }

    public MySpringJUnit4ClassRunner(Class<?> clazz) throws InitializationError {
        super(clazz);
    }
}
