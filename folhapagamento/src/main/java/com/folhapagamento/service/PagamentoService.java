package com.folhapagamento.service;

import com.folhapagamento.entities.Pagamento;
import com.folhapagamento.entities.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PagamentoService {

    @Value("${hr-worker.host}")
    private String workerHost;

    @Autowired
    private RestTemplate restTemplate;

    public Pagamento getPagamento(long id, int dias){
        Map<String,String> uriVariables = new HashMap<>();
        uriVariables.put("id",""+id);


        Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}",Worker.class,uriVariables);
        return new Pagamento(worker.getName(),worker.getDailyIncome(), dias);
    }
}
