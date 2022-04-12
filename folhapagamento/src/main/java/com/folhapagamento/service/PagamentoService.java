package com.folhapagamento.service;

import com.folhapagamento.entities.Pagamento;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {
    public Pagamento getPagamento(long id, int dias){
        return new Pagamento("Joao", 100.0,dias);
    }
}
