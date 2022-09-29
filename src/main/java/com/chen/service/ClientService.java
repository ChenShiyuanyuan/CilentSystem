package com.chen.service;

import com.chen.pojo.Client;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 东辉
 * guigu_SpringMVC
 */
public interface ClientService {

    //增加一个客户
    int addClient(Client client);
    //删除一个客户
    int deleteClientById(int id);
    //更新一个客户信息
    int updateClient(Client client);
    //查询一个客户信息
    Client queryClientById(int id);
    //查询全部的客户信息
    List<Client> queryAllClient();

    //通过姓名查询客户信息
    Client queryClientByName(String name);
}
