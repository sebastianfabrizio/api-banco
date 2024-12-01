package pe.edu.cibertec.apibancocibertec.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.apibancocibertec.dto.CuentaDto;
import pe.edu.cibertec.apibancocibertec.dto.TransferenciaDto;
import pe.edu.cibertec.apibancocibertec.service.ICuentaService;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/api/v1/cuenta")
public class CuentaController {

    private final ICuentaService cuentaService;


    @GetMapping("/lista")
    public ResponseEntity<List<CuentaDto>> listar() {
        List<CuentaDto> cuentaDtos = cuentaService.listaCuentas();
        return new ResponseEntity<>(cuentaDtos, HttpStatus.OK);
    }

    @PostMapping("/tranferir")
    public ResponseEntity<String> transaccion(@RequestBody TransferenciaDto transferenciaDto){
        try{
            cuentaService.transferir(transferenciaDto);
            return new ResponseEntity<>("Tranferencia correcta", HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseEntity<>("Error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
