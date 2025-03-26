package br.com.wtech.pagamento.service;

import br.com.wtech.pagamento.dto.pagamento.PagamentoRequest;
import br.com.wtech.pagamento.dto.pagamento.PagamentoResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PagamentoService {
    private static final Set<String> ccvs = new HashSet<>();

    static {
        ccvs.add("321");
        ccvs.add("456");
    }

    public ResponseEntity<PagamentoResponse> processar(PagamentoRequest request) {

        if (ccvs.contains(request.getCartao().getCcv())) {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(new PagamentoResponse(request.getId()));
        }

        return ResponseEntity
                .status(HttpStatus.FORBIDDEN)
                .body(new PagamentoResponse(request.getId()));
    }
}