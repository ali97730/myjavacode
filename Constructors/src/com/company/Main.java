package com.company;

public class Main {

    public static void main(String[] args) {
            Bank mybank = new Bank();//(1452,5000,"mohsin","ali97730@gmail.com",9424823);
            mybank.deposit(1000);
            mybank.withdraw(901);

            VipCustomer myvipcustomer = new VipCustomer("ali97730",1234);

        System.out.println(myvipcustomer.getCreditlimit() +"\n"+myvipcustomer.getEmail_add()+"\n"+myvipcustomer.getName());
    }
}
