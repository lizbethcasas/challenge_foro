package com.challenge.alura.foro.domain.topico.validations.update;

import com.challenge.alura.foro.domain.topico.dto.ActualizarTopicoDTO;

public interface ValidarTopicoActualizado {
    void validate(ActualizarTopicoDTO data);
}
