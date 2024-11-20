package m223.project.dont_drop_the_blop.security;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import m223.project.dont_drop_the_blop.model.Role;
import m223.project.dont_drop_the_blop.model.User;
import m223.project.dont_drop_the_blop.repositories.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));
        List<GrantedAuthority> authorities = new ArrayList<>(); // important role to authorities mapping
        for (Role r : user.getRoles()) {
            authorities.add(new SimpleGrantedAuthority(r.toString()));
        }
        return UserDetailsImpl.build(user);
    }
}
