package com.cadastrodeusuario.apidecadastro.repository;

import com.cadastrodeusuario.apidecadastro.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
}
