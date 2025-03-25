package br.com.wtech.pagamento.dto.pagamento;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class PagamentoRequest implements Serializable {
    private Double total;
    private CartaoDTO cartao;

}
