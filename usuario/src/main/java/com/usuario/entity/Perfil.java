package com.usuario.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_perfil")
public class Perfil implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String perfilName;

    public Perfil() {
    }

    public Perfil(Long id, String perfilName) {
        this.id = id;
        this.perfilName = perfilName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPerfilName() {
        return perfilName;
    }

    public void setPerfilName(String perfilName) {
        this.perfilName = perfilName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Perfil perfil = (Perfil) o;
        return Objects.equals(perfilName, perfil.perfilName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(perfilName);
    }
}
