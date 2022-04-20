package com.usuario.resources;

import com.usuario.entity.Usuario;
import com.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioResource {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Long id){
        Usuario obj = usuarioRepository.findById(id).get();
        return ResponseEntity.ok(obj);
    }
    @GetMapping(value = "/search")
    public ResponseEntity<Usuario> findByEmail(@RequestParam String email){
        Usuario obj = usuarioRepository.findByEmail(email);
        return ResponseEntity.ok(obj);
    }
}
