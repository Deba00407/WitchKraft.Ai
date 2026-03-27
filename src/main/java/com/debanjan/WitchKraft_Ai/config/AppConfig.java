package com.debanjan.WitchKraft_Ai.config;

import com.debanjan.WitchKraft_Ai.auth.AuditorAwareImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorAwareProvider")
public class AppConfig {

    @Bean
    AuditorAware<String> auditorAwareProvider(){
        return new AuditorAwareImpl();
    }
}
