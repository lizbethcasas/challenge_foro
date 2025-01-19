package com.challenge.alura.foro.domain.topico.dto;


import com.challenge.alura.foro.domain.curso.Categoria;
import com.challenge.alura.foro.domain.topico.Estado;
import com.challenge.alura.foro.domain.topico.Topico;

public record DetallesTopicoDTO(Long id,
                                String titulo,
                                String mensaje,
                                LocalDateTime fechaCreacion,
                                LocalDateTime ultimaActualizacion,
                                Estado estado,
                                String usuario,
                                String curso,
                                Categoria categoriaCurso) {
    public DetallesTopicoDTO(Topico topico) {
        this(topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaCreacion(),
                topico.getUltimaActualizacion(),
                topico.getEstado(),
                topico.getUsuario().getUsername(),
                topico.getCurso().getName(),
                topico.getCurso().getCategoria()
        );
    }
}
