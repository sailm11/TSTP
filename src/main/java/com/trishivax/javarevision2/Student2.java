package com.trishivax.javarevision2;

import com.trishivax.javarevision.Teacher;

public class Student2 {


    //if there is nothing written before any member method or variable so there it could be considered as
    //default

    //member variables
    int rollNo = 101;
    String name = "Ram";
    String course = "B.E.";


    //member methods
    public void read() {
        System.out.println("Student can read !");
    }

    public void code() {
        System.out.println("Student can code !");
    }

    static void main(String[] args) {
        Teacher tt = new Teacher();
        System.out.println(tt.mobileNo);
        tt.teach();
    }


}
