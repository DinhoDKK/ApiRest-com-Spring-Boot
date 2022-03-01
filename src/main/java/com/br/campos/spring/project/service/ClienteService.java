package com.br.campos.spring.project.service;

import com.br.campos.spring.project.model.Cliente;

/**
 * Implementado o padrão <b>Strategy</b> no dominio de Cliente.
 *
 * @author DinhoDKK
 */
public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
