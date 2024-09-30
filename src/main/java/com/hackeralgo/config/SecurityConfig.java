package com.hackeralgo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable() // Disable CSRF for testing purposes
                .authorizeRequests()
                .antMatchers("/h2-console/**", "/**").permitAll() // Allow all requests
                .anyRequest().authenticated(); // Authenticate other requests

        // To allow H2 console frames
        http.headers().frameOptions().disable();
    }
}