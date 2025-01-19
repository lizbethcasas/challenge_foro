package com.challenge.alura.foro.domain.curso.dto;

import com.challenge.alura.foro.domain.curso.Categoria;

public record ActualizarCursoDTO(String name,
                                 Categoria categoria,
                                 Boolean activo) {
}
