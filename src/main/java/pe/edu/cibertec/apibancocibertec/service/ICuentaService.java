package pe.edu.cibertec.apibancocibertec.service;

import pe.edu.cibertec.apibancocibertec.dto.CuentaDto;
import pe.edu.cibertec.apibancocibertec.dto.TransferenciaDto;

import java.util.List;

public interface ICuentaService {

    List<CuentaDto> listaCuentas();
    void transferir(TransferenciaDto transferenciaDto);
}
