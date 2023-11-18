package br.com.randrade.services;

import br.com.randrade.domain.Cliente;
import br.com.randrade.dao.IClienteDAO;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);}
    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return this.dao.consultar(cpf);
    }

}
