package com.chen.controller;

import com.chen.pojo.Client;
import com.chen.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 东辉
 * guigu_SpringMVC
 */
@Controller
@RequestMapping("/client")
public class ClientController {
    //controller 层调 service 层
    @Autowired
    @Qualifier("ClientServiceImpl")
    private ClientService clientService;
    
    //查询全部的客户并且返回到一个客户信息展示页面
    @RequestMapping("/allClient")
    public String list(Model model){
        List<Client> list = clientService.queryAllClient();

        model.addAttribute("list",list);
        return "allClient";
    }

    //跳转到增加客户信息的页面
    @RequestMapping("/toAddClient")
    public String toAddClient(){
        return "addClient";
    }

    //添加客户信息
    @RequestMapping("/addClient")
    public String addClient(Client client){
        System.out.println("addClient=>" + client);
        int i = clientService.addClient(client);
        return "redirect:/client/allClient";
    }


    //跳转到修改客户信息的页面
    @RequestMapping("/toUpdateClient")
    public String toUpdateClient(int id,Model model){
        Client client = clientService.queryClientById(id);
        model.addAttribute("client",client);
        return "updateClient";
    }


    //修改客户信息
    @RequestMapping("/updateClient")
    public String updateClient(Client client){
        System.out.println("updateClient=>" + client);
        int i = clientService.updateClient(client);
        if(i > 0){
            System.out.println("修改客户信息成功" + client);
        }
        return "redirect:/client/allClient";
    }


    //删除客户信息
    @RequestMapping("/deleteClient")
    public String deleteClient(int id){
        int i = clientService.deleteClientById(id);
        return "redirect:/client/allClient";
    }


    //查询客户信息
    @RequestMapping("/queryClient")
    public String queryClient(String clientName,Model model){
        Client client = clientService.queryClientByName(clientName);
        System.err.println("queryClient=>" + client);

        List<Client> list = new ArrayList<Client>();
        list.add(client);

        for (Client client1 : list) {
            System.out.println(client);
        }

        if (client == null){
            list = clientService.queryAllClient();
            System.out.println("======未查到=======");
            for (Client client1 : list) {
                System.out.println(client);
            }
            model.addAttribute("error","未查到");
        }

        model.addAttribute("list",list);
        return "allClient";
    }

}
