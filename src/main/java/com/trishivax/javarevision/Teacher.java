package com.trishivax.javarevision;

public class Teacher{

    //private: it would be accessible within its class itself
    //default: It will be accesible within all the classes of same package
    //protected: It can be accessible outside of teh package as well but atleast
    //inheritance is required
    //Public would be available anywhere in the project

    private int age = 50;
    String name = "abc";//if no keyword is added then that would be default
    protected String subject = "Math";
    public String mobileNo ="88888888";

    public void teach(){
        System.out.println("teaching !");
    }
}

 class HHH{

}


