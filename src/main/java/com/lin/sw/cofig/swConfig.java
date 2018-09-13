package com.lin.sw.cofig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class swConfig {
    private static final String SW_SCAN_PATH ="com.lin.sw.controller";
    private static final String VASSION = "1.0";

    @Bean
    public Docket swApi(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        docket.apiInfo(apiInfo());
        return docket;
    }

    private ApiInfo apiInfo(){
        return new ApiInfo(
                "Lin open API test",
                "must add token",
                VASSION,
                "www.lin.com",
                "LIN",
                "",
                ""
        );
    }
}
