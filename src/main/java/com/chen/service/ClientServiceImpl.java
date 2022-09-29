package com.chen.service;

import com.chen.mapper.ClientMapper;
import com.chen.pojo.Client;

import java.util.List;

/**
 * @author 东辉
 * guigu_SpringMVC
 */
public class ClientServiceImpl implements ClientService{

    //业务层调dao(Mapper)层：组合Mapper层

    private ClientMapper clientMapper;

    public void setClientMapper(ClientMapper clientMapper) {
        this.clientMapper = clientMapper;
    }

    public int addClient(Client client) {
        return clientMapper.addClient(client);
    }

    public int deleteClientById(int id) {
        return clientMapper.deleteClientById(id);
    }

    public int updateClient(Client client) {
        return clientMapper.updateClient(client);
    }

    public Client queryClientById(int id) {
        return clientMapper.queryClientById(id);
    }

    public List<Client> queryAllClient() {
        return clientMapper.queryAllClient();
    }

    public Client queryClientByName(String name) {
        return clientMapper.queryClientByName(name);
    }
}
