package com.greenfoxacademy.my_brilliant_thoughts.security;

import com.greenfoxacademy.my_brilliant_thoughts.models.ApplicationUser;
import com.greenfoxacademy.my_brilliant_thoughts.services.UserServiceImpl;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.greenfoxacademy.my_brilliant_thoughts.security.SecurityConstants.HEADER_STRING;
import static com.greenfoxacademy.my_brilliant_thoughts.security.SecurityConstants.SECRET;
import static com.greenfoxacademy.my_brilliant_thoughts.security.SecurityConstants.TOKEN_PREFIX;

public class JWTAuthorizationFilter extends BasicAuthenticationFilter {

  private final UserServiceImpl userService;

  @Autowired
  public JWTAuthorizationFilter(AuthenticationManager authenticationManager,
                                UserServiceImpl userService) {
    super(authenticationManager);
    this.userService = userService;
  }

  @Override
  protected void doFilterInternal(HttpServletRequest request,
                                  HttpServletResponse response,
                                  FilterChain chain) throws IOException, ServletException {
    String header = request.getHeader(HEADER_STRING);
    if (header == null || !header.startsWith(TOKEN_PREFIX)) {
      chain.doFilter(request, response);
      return;
    }
    UsernamePasswordAuthenticationToken usernamePasswordAuth = getAuthenticationToken(request);
    SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuth);
    chain.doFilter(request, response);
  }

  private UsernamePasswordAuthenticationToken getAuthenticationToken(HttpServletRequest request) {
    String token = request.getHeader(HEADER_STRING);
    if (token == null) return null;
    String username = Jwts.parser().setSigningKey(SECRET)
        .parseClaimsJws(token.replace(TOKEN_PREFIX, ""))
        .getBody()
        .getSubject();
    UserDetails userDetails = userService.loadUserByUsername(username);
    ApplicationUser applicationUser = userService.loadApplicationUserByUsername(username);

    return username != null
        ? new UsernamePasswordAuthenticationToken(applicationUser, null, userDetails.getAuthorities())
        : null;
  }
}
