package com.folhapagamento.resources;

import com.folhapagamento.entities.Pagamento;
import com.folhapagamento.service.PagamentoService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pagamentos")
public class PagamentoResources {
    @Autowired
    private PagamentoService pagamentoService;

    //quando microserviço fica indisponivel o caminho alternativo é chamado
    @HystrixCommand(fallbackMethod = "getPagamentoAlternativo")
    @GetMapping(value = "/{workerId}/dias/{dias}")
    public ResponseEntity<Pagamento> getPagamento(@PathVariable Long workerId,@PathVariable Integer dias){
        Pagamento pagamento = pagamentoService.getPagamento(workerId,dias);
        return ResponseEntity.ok(pagamento);
    }
    public ResponseEntity<Pagamento> getPagamentoAlternativo(Long workerId,Integer dias){
        Pagamento pagamento = new Pagamento("Erro",66.0, dias);
        return ResponseEntity.ok(pagamento);
    }

}
