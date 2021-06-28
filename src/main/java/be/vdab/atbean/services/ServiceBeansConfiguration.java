package be.vdab.atbean.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ServiceBeansConfiguration {
    @Bean
    DefaultKwadraatServices kwadraat() {
        return new DefaultKwadraatServices();
    }
}
