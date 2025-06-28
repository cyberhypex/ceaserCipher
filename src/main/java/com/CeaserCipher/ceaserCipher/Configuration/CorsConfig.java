package com.CeaserCipher.ceaserCipher.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer(){
        return new WebMvcConfigurer() {
        @Override
            public void addCorsMappings(CorsRegistry corsRegistry){
        corsRegistry.addMapping("/**")
                .allowedOrigins("https://lucent-bubblegum-9def40.netlify.app")
                .allowedMethods("GET","POST", "PUT", "DELETE")
                .allowedHeaders("*");
        }
        };
    }
}
