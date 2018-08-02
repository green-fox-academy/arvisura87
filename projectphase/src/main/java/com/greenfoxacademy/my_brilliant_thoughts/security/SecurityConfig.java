package com.greenfoxacademy.my_brilliant_thoughts.security;

import com.greenfoxacademy.my_brilliant_thoughts.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
  private final UserServiceImpl userService;
  private static final String USER = "USER";

  @Autowired
  public SecurityConfig(UserServiceImpl userService) {
    this.userService = userService;
  }

  @Override
  public void configure(HttpSecurity httpSecurity) throws Exception {
    httpSecurity.authorizeRequests()
          .antMatchers("/*").hasRole(USER)
        .and()
          .addFilter(new JWTAuthenticationFilter(authenticationManager()))
          .addFilter(new JWTAuthorizationFilter(authenticationManager(), userService))
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
