package com.greenfoxacademy.my_brilliant_thoughts.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  private static final String USER = "USER";

  @Override
  public void configure(HttpSecurity httpSecurity) throws Exception {
    httpSecurity.authorizeRequests()
        .antMatchers("/*").hasRole(USER)
        .and()
        .formLogin();
  }

  @Autowired
  public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication()
          .withUser("Bela").password("{noop}bela").roles(USER)
        .and()
          .withUser("Tamas").password("{noop}tamas").roles(USER);
  }
}
