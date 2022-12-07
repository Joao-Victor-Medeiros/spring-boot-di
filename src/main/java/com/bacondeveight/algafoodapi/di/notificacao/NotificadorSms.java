package com.bacondeveight.algafoodapi.di.notificacao;

import com.bacondeveight.algafoodapi.di.model.Cliente;
import org.springframework.stereotype.Component;

@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorSms implements Notificador {
    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s através do celular %s : %s\n", cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}
