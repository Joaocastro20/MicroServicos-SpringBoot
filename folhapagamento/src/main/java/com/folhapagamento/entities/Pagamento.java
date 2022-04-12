package com.folhapagamento.entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.io.Serializable;


public class Pagamento implements Serializable {

    private static  final long serialVersionUID= 1L;
    private String name;
    private Double pagdiario;
    private Integer dias;

    public Pagamento(String name, Double pagdiario, Integer dias) {
        this.name = name;
        this.pagdiario = pagdiario;
        this.dias = dias;
    }

    public Pagamento() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPagdiario() {
        return pagdiario;
    }

    public void setPagdiario(Double pagdiario) {
        this.pagdiario = pagdiario;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    public double getTotal(){
        return dias * pagdiario;
    }

}
