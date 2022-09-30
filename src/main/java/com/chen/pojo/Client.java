package com.chen.pojo;

/**
 * @author 陈士圆
 * guigu_SpringMVC
 *
 * guigu_SpringMVC
 */
public class Client{

    private int id;
    private String password;
    private String name;
    private String sex;
    private String phone;
    private double balance;

    public Client(int id, String password, String name, String sex, String phone, double balance) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.balance = balance;
    }

    public Client() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", balance=" + balance +
                '}';
    }
}
