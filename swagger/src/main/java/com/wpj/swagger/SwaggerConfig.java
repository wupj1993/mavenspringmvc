/*
 * Copyright (c) 2015 / 7 / 22 11 :22 :49
 * BY:wupeiji
 * QQ:757671834
 *
 */

package com.wpj.swagger;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.annotation.Resource;

/**
 * -------------------------------------
 * Created by wupeji on 2015-07-22 23:22
 * ----------------------------------------
 **/
@Configuration
@EnableSwagger
@ComponentScan(basePackages = "com.wpj.swagger.controller")
@EnableWebMvc
public class SwaggerConfig {
    @Resource
    private SpringSwaggerConfig springSwaggerConfig;
    @Bean  // Don't forget the @Bean annotation
    public SwaggerSpringMvcPlugin customImplementation() {
        return new SwaggerSpringMvcPlugin(this.springSwaggerConfig)
                .apiInfo(apiInfo())
                .includePatterns("/(?!error).*")
                ;
    }
    /**
     * 描述一些关于
     * @return
     */
    private ApiInfo apiInfo() {

        ApiInfo apiInfo = new ApiInfo("Rest API.作者吴培基", "使用Swagger产生的API接口文档",
                "<a href='https://github.com/BigDuck'>Github</a>", "757671834@qq.com",
                "API许可证", "Custom API License URL"
        );
        return apiInfo;
    }

}
