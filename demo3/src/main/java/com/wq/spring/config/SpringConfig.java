package com.wq.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Description
 *
 * @author WangQian
 * @create 2022-06-08 11:35
 */
@Configuration //配置类，替代xml
@ComponentScan(basePackages = {"com.wq.spring"})
public class SpringConfig {
}