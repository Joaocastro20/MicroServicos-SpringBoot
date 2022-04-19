package com.usuario.repository;

import com.usuario.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    //query personalizada
    Usuario findByEmail(String email);
}
