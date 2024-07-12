package com.stajProje.stajProje.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@Profile("dev")
public class BasicAuthenticationSecurityConfig  {

    //FilterChain
    //Authenticate all request
    //Basic Authentication
    //Disabling csrf
    // statles rest api

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

        httpSecurity.authorizeHttpRequests(configure ->{
                configure.anyRequest().authenticated();
        });


        httpSecurity.httpBasic(Customizer.withDefaults());

        return httpSecurity.build();
    }
}
