package com.oauth.services;

import com.oauth.entity.Usuario;
import com.oauth.feignclients.UsuarioFeignClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements UserDetailsService {

    private static Logger logger = LoggerFactory.getLogger(UsuarioService.class);

    @Autowired
    private UsuarioFeignClients usuarioFeignClients;

    public Usuario findByEmail(String email){
        Usuario usuario = usuarioFeignClients.findByEmail(email).getBody();
        if(usuario == null){
            logger.error("email not found "+email);
            System.out.println("email not found");
        }
            logger.info("email found "+email);
            return usuario;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioFeignClients.findByEmail(username).getBody();
        if(usuario == null){
            logger.error("email not found "+username);
            System.out.println("email not found");
        }
        logger.info("email found "+username);
        return usuario;
    }
}
