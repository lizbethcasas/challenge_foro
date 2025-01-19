package com.challenge.alura.foro.domain.topico.dto;

import com.challenge.alura.foro.domain.topico.Estado;
public record ActualizarTopicoDTO(
        String titulo,
        String mensaje,
        Estado estado,
        Long cursoId
) {
}
