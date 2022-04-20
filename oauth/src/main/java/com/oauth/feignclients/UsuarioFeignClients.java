package com.oauth.feignclients;


import com.oauth.entity.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "usuario", path = "/usuario")
    public interface UsuarioFeignClients {
        @GetMapping(value = "/search")
        ResponseEntity<Usuario> findByEmail(@RequestParam String email);

}
