package com.folhapagamento.service;

import com.folhapagamento.entities.Pagamento;
import com.folhapagamento.entities.Worker;
import com.folhapagamento.feignclients.FolhaFeignClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {

    @Autowired
    private FolhaFeignClients folhaFeignClients;

    public Pagamento getPagamento(long id, int dias){
        Worker worker = folhaFeignClients.findById(id).getBody();
        return new Pagamento(worker.getName(),worker.getDailyIncome(), dias);
    }
}
