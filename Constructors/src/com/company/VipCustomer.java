package com.company;

public class VipCustomer {
    private String name;
    private String email_add;
    private int creditlimit;

    public VipCustomer() {
        this("ali","ali97777",1342);
        System.out.println("empty constructor is called");
    }
    public VipCustomer(String name,String email_add,int creditlimit) {
        this.name= name;
        this.email_add = email_add;
        this.creditlimit  = creditlimit;
        System.out.println("parameterised constructor is called");
    }

    public VipCustomer(String email_add, int creditlimit) {
        this("mohsin",email_add,creditlimit);
        System.out.println("default constructor is called");
    }



    public String getName() {
        return name;
    }

    public String getEmail_add() {
        return email_add;
    }

    public int getCreditlimit() {
        return creditlimit;
    }
}
