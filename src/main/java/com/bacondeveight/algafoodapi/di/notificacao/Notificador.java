package com.bacondeveight.algafoodapi.di.notificacao;

import com.bacondeveight.algafoodapi.di.model.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
