package com.company;

public class Bank {

    private int accountnumber;
    private int balance;
    private String customername;
    private String email;
    private  int phonenumber;

    public Bank(){
        this(1234,5100,"mohsin","ali97730@gmail.com",942823);
        System.out.println("Empty constructor called ");
    }
    public Bank(int accountnumber,int balance,String customername,String email,int phonenumber){

        this.accountnumber = accountnumber;
        this.balance = balance;
        this.customername = customername;
        this.email = email;
        this.phonenumber = phonenumber;
        System.out.println("Parameterised contructor is called");
    }


    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void deposit(int depositedamount)
    {
        this.balance+=depositedamount;
    }
    public void withdraw(int withdrawalamount)
    {
        if(this.balance - withdrawalamount < 100){
            System.out.println("insufficient balance you cannot withdraw money  !! \n");
        }else{
            this.balance-=withdrawalamount;
            System.out.println("the withdrawal amount is" + withdrawalamount +"and is in process  and the current balance is " +this.balance);

        }
    }
}
