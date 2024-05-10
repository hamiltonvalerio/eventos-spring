package br.eti.valerio.mseventosspringkafkamongo.coredomain.entity;

import java.time.LocalDateTime;

public class Reserva {

    private Long id;
    private String nomeEvento;
    private String nomeCliente;
    private LocalDateTime dataReserva;

    public Reserva() {
    }

    public Reserva(Long id, String nomeEvento, String nomeCliente, LocalDateTime dataReserva) {
        this.id = id;
        this.nomeEvento = nomeEvento;
        this.nomeCliente = nomeCliente;
        this.dataReserva = dataReserva;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public LocalDateTime getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDateTime dataReserva) {
        this.dataReserva = dataReserva;
    }
}
