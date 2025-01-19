package com.challenge.alura.foro.domain.respuesta.validations.update;

import com.challenge.alura.foro.domain.respuesta.dto.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {
    void validate(ActualizarRespuestaDTO data, Long respuestaId);
}
