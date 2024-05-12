package br.eti.valerio.mseventosspringkafkamongo.adapter.input.controller;

import br.eti.valerio.mseventosspringkafkamongo.adapter.input.dto.ReservaDTO;
import br.eti.valerio.mseventosspringkafkamongo.application.ports.in.ReservaUseCasePort;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reserva")
public class ReservaController {

    private final ReservaUseCasePort reservaUseCasePort;

    @Autowired
    public ReservaController(ReservaUseCasePort reservaUseCasePort) {
        this.reservaUseCasePort = reservaUseCasePort;
    }

    @PostMapping("/salvar")
    @Operation(summary = "Criar nova reserva")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Reserva  criada"),
            @ApiResponse(responseCode = "400", description = "Invalid input data")
    })
    public ResponseEntity<ReservaDTO> criarReserva(@RequestBody ReservaDTO reservaDTO) {
        ReservaDTO dto = reservaUseCasePort.salvarReserva(reservaDTO);
        return ResponseEntity.ok(dto);
    }

    @GetMapping("/buscar/{id}")
    @Operation(summary = "Buscar reserva por id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Reserva encontrada"),
            @ApiResponse(responseCode = "404", description = "Reserva não encontrada")
    })
    public ResponseEntity<ReservaDTO> buscarReserva(@PathVariable String id) {
        ReservaDTO dto = reservaUseCasePort.buscarReserva(id);
        return ResponseEntity.ok(dto);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deletar reserva por id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Reserva deletada"),
            @ApiResponse(responseCode = "404", description = "Reserva não encontrada")
    })
    public void deletarReserva(@PathVariable String id) {
        reservaUseCasePort.deletarReserva(id);
    }

    @PutMapping
    @Operation(summary = "Atualizar reserva")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Reserva atualizada"),
            @ApiResponse(responseCode = "404", description = "Reserva não encontrada")
    })
    public ResponseEntity<ReservaDTO> atualizarReserva(@RequestBody ReservaDTO reservaDTO) {
        ReservaDTO dto = reservaUseCasePort.atualizarReserva(reservaDTO);
        return ResponseEntity.ok(dto);
    }

}
