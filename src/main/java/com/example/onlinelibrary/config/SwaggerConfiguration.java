package com.example.onlinelibrary.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket onlineLibraryApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo() {
        return new ApiInfoBuilder()
                .title("Online-library API BooksLit")
                .version("1.0")
                .description("BooksLit is an ad-free API for easily accessing anything" +
                        "from a great variety of modern novels to the Shakespearean classics.")
                .contact(new Contact("Ivan Krylosov",
                        "https://github.com/IvanFromOdesa",
                        "ivankrylosov123@gmail.com"))
                .license("Apache License 2.0")
                .build();
    }
}
