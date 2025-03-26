package br.com.wtech.pagamento.dto.pagamento;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
public class PagamentoRequest implements Serializable {
    private UUID id;
    private Double total;
    private CartaoDTO cartao;

}