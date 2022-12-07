package com.bacondeveight.algafoodapi.listener;

import com.bacondeveight.algafoodapi.di.notificacao.NivelUrgencia;
import com.bacondeveight.algafoodapi.di.notificacao.Notificador;
import com.bacondeveight.algafoodapi.di.notificacao.TipoDoNotificador;
import com.bacondeveight.algafoodapi.di.service.ClienteAtivadoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoService {
    @TipoDoNotificador(NivelUrgencia.NAO_URGENTE)
    @Autowired
    private Notificador notificador;

    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent event) {
        notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo!");
    }
}

