package com.example.alpha.config;

import com.example.alpha.common.GreekChef;
import org.springframework.beans.factory.BeanRegistrarDslMarker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import util.Chef;

@Configuration
public class RestaurantConfig {
    @Bean
    public Chef greekChef() {
        return new GreekChef();
    }
}
