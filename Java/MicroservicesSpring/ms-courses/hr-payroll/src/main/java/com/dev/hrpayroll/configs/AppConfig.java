package com.dev.hrpayroll.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**Para pegar as informações do microserviço hr-worker
 * */
@Configuration
public class AppConfig {


    /** Annotation para criar o componente por uma chamada de método.
     * */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
