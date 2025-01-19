package com.challenge.alura.foro.domain.usuario.dto;


import com.challenge.alura.foro.domain.usuario.Usuario;
import ccom.challenge.alura.foro.domain.usuario.Role;

public record DetallesUsuarioDTO(Long id,
                                 String username,
                                 Role role,
                                 String nombre,
                                 String apellido,
                                 String email,
                                 Boolean enabled) {
    public DetallesUsuarioDTO(Usuario usuario){
        this(usuario.getId(),
                usuario.getUsername(),
                usuario.getRole(),
                usuario.getNombre(),
                usuario.getApellido(),
                usuario.getEmail(),
                usuario.getEnabled()
        );
    }
}
