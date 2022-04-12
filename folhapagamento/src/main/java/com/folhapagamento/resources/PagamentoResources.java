package com.folhapagamento.resources;

import com.folhapagamento.entities.Pagamento;
import com.folhapagamento.service.PagamentoService;
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

    @GetMapping(value = "/{workerId}/dias/{dias}")
    public ResponseEntity<Pagamento> getPagamento(@PathVariable Long workerId,@PathVariable Integer dias){
        Pagamento pagamento = pagamentoService.getPagamento(workerId,dias);
        return ResponseEntity.ok(pagamento);
    }
}
