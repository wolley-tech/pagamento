package br.com.wtech.pagamento.controller;

import br.com.wtech.pagamento.dto.pagamento.PagamentoRequest;
import br.com.wtech.pagamento.dto.pagamento.PagamentoResponse;
import br.com.wtech.pagamento.service.PagamentoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/pagamentos")
@AllArgsConstructor
public class PagamentoController {
    private final PagamentoService pagamentoService;


    @PostMapping
    public ResponseEntity<PagamentoResponse> processar(@RequestBody PagamentoRequest request) throws InterruptedException {
        return pagamentoService.processar(request);
    }
}
