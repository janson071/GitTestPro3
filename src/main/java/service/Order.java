package service;

import dao.UserDao;

public class Order {
    public static void main(String[] args) {
        System.out.println("order1");
        System.out.println("order2");

        UserDao ud = new UserDao();
        ud.setUserId("1");
    }
}
