package br.com.wtech.pagamento.dto.pagamento;

import lombok.Data;

@Data
public class CartaoDTO {
    private String titular;
    private String numero;
    private String ccv;

}
