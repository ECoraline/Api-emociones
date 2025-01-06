package com.CoralineApi.api.infra;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Reemplaza "*" con el origen específico de tu frontend
        registry.addMapping("/**")
                .allowedOrigins("https://ecoraline.github.io/web-api-emociones/")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("*")
                .allowCredentials(true); // Mantén habilitadas las credenciales
    }
}