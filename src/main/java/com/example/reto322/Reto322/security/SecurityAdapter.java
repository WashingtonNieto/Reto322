package com.example.reto322.Reto322.security;

import com.example.reto322.Reto322.controller.WebSecurityConfigureAdapter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityAdapter extends WebSecurityConfigureAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests(a -> a
                .antMatchers("/", "/error", "/webjars/**","/api/**).permitAll().anyRequest().authenticated())
                .exceptionHandling(e -> e
                        .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
                ).oauth2Login().defaultSuccessUrl("/", true));

        http.cors().and().csrf().disable();
    }
}
