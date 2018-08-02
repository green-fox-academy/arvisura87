package com.greenfoxacademy.my_brilliant_thoughts.services;

import com.greenfoxacademy.my_brilliant_thoughts.models.ApplicationUser;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserDetailsService {

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    ApplicationUser applicationUser = loadApplicationUserByUsername(username);
    return new User(applicationUser.getUsername(), applicationUser.getUserPassword(),
        AuthorityUtils.createAuthorityList("USER"));
  }

  public ApplicationUser loadApplicationUserByUsername(String username) {
    return new ApplicationUser("batman", "batman");
  }
}
