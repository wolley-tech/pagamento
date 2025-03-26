package br.com.wtech.pagamento.queue;


import br.com.wtech.pagamento.dto.pagamento.PagamentoRequest;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class ReceiverQueue {

    @RabbitListener(queues = {"${queue.name}"})
    public void receiveMessage(@Payload PagamentoRequest request) {
        System.out.println("Received <" + request + ">");
    }


}
