package com.backend.parcial.test;

import com.backend.parcial.entity.Odontologo;
import com.backend.parcial.repository.impl.OdontologoDaoEnMemoria;
import com.backend.parcial.repository.impl.OdontologoDaoH2;
import com.backend.parcial.service.impl.OdontologoService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OdontologoServiceTest{

    private OdontologoService odontologoService;

    @Test
    void deberiaRetornarUnaListaNoVaciaDeOdontologosEnH2(){
     odontologoService = new OdontologoService(new OdontologoDaoH2());
     assertFalse(odontologoService.listarOdontologos().isEmpty());
    }

    @Test
    void deberiaRetornarUnaListaNoVaciaEnMemoria(){
        odontologoService = new OdontologoService(new OdontologoDaoEnMemoria());
        assertFalse(odontologoService.listarOdontologos().isEmpty());
    }


}
