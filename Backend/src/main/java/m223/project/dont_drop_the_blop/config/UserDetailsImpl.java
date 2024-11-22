package m223.project.dont_drop_the_blop.config;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

import m223.project.dont_drop_the_blop.model.User;


public class UserDetailsImpl implements UserDetails {
  private static final long serialVersionUID = 1L;

  private Long id;
  private String username;
  private int score;

  @JsonIgnore
  private String password;

  private Collection<? extends GrantedAuthority> authorities;

  public UserDetailsImpl(Long id, String username, int score, String password,
      Collection<? extends GrantedAuthority> authorities) {
    this.id = id;
    this.username = username;
    this.score = score;
    this.password = password;
    this.authorities = authorities;
  }

  public static UserDetailsImpl build(User user) {
    List<GrantedAuthority> authorities = user.getRoles().stream()
        .map(role -> new SimpleGrantedAuthority(role.toString()))
        .collect(Collectors.toList());

    return new UserDetailsImpl(
        (long)user.getId(),
        user.getUsername(),
        user.getScore(),
        user.getPassword(),
        authorities);
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return authorities;
  }

  public Long getId() {  return id;   }

  public int getScore() {  return score;   }

  @Override
  public String getPassword() {  return password;  }

  @Override
  public String getUsername() { return username;  }

  @Override
  public boolean isAccountNonExpired() { return true;   }

  @Override
  public boolean isAccountNonLocked() { return true;   }

  @Override
  public boolean isCredentialsNonExpired() {  return true;   }

  @Override
  public boolean isEnabled() {   return true;   }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UserDetailsImpl user = (UserDetailsImpl) o;
    return Objects.equals(id, user.id);
  }
}
