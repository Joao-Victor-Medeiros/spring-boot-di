package com.bacondeveight.algafoodapi.di.service;

import com.bacondeveight.algafoodapi.di.model.Cliente;

public class ClienteAtivadoEvent {
    private  Cliente cliente;
    ClienteAtivadoEvent(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
