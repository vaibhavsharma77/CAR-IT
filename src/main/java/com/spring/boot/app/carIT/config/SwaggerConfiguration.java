package com.spring.boot.app.carIT.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.Collections;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2).
                select().apis(RequestHandlerSelectors.basePackage("com.spring.boot.app.carIT.controllers")).
                paths(regex("/carIt.*")).build().
                apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "Spring Security Based Swagger Implementation",
                "Swagger Example with Spring Security,Hibernate,JPA,MySQL",
                "Version 2.0",
                "https://www.linkedin.com/in/vaibhavsharma777/",
                new Contact("Vaibhav Sharma", "https://about.me/iamvaibhavsharma",
                        "Vaibhavsharma777@yahoo.com"),
                "vaibhav", "https://www.facebook.com/vs004", Collections.emptyList());

        return apiInfo;
    }
}
