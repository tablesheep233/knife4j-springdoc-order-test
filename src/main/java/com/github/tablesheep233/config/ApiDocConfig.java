package com.github.tablesheep233.config;

import org.springdoc.core.customizers.GlobalOpenApiCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * The type Api doc config.
 *
 * @author tablesheep233
 */
@Configuration
public class ApiDocConfig {

    /**
     * 根据@Tag 上的排序，写入x-order
     *
     * @return the global open api customizer
     */
    @Bean
    public GlobalOpenApiCustomizer orderGlobalOpenApiCustomizer() {
        return openApi -> {
            openApi.getTags().forEach(tag -> {
                tag.setExtensions(Map.of("x-order", tag.getDescription().charAt(0)));
            });
        };
    }
}
