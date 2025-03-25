package br.com.wtech.pagamento.controller;

import br.com.wtech.pagamento.dto.pagamento.PagamentoRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {
    private static final Set<String> ccvs = new HashSet<>();

    static {
        ccvs.add("321");
        ccvs.add("456");
    }


    @PostMapping
    public ResponseEntity<Void> validar(@RequestBody PagamentoRequest request){

        if(ccvs.contains(request.getCartao().getCcv())){
            return  ResponseEntity
                    .status(HttpStatus.OK)
                    .build();
        }

        return  ResponseEntity
                .status(HttpStatus.FORBIDDEN)
                .build();
    }
}
