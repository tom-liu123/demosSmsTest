package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//开启组件自动扫描和自动化配置
/**
 * @SpringBootApplication 融合了三个注解
 *  Spring的@Configuration：标明该类使用Spring基于Java的配置。
 *  Spring的@ComponentScan：启用组件扫描，这样你写的Web控制器类和其他组件才能被
 * 自动发现并注册为Spring应用程序上下文里的Bean。本章稍后会写一个简单的Spring MVC
 * 控制器，使用@Controller进行注解，这样组件扫描才能找到它。
 *  Spring Boot 的 @EnableAutoConfiguration ：这个不起眼的小注解也可以称为
 * @Abracadabra①，就是这一行配置开启了Spring Boot自动配置的魔力，让你不用再写成
 * 篇的配置了。
 */
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        //负责启动引导应用程序
    }

}
