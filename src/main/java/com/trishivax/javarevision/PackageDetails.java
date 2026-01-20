package com.trishivax.javarevision;//the class file in which we are entering, it is present
//in which package


import com.trishivax.javarevision2.Student2;//ham Student2 wali class ko  com.trishivax.javarevision2

import java.io.File;
//se la rahe hai

class PackageDetails2 {
    static void main(String[] args) {

        //Important point: By default Java works on thr classes present in java.lang
        //package

        String ss = new String();

        Thread t = new Thread();
        File f = new File("");

        Exception e = new Exception();

        //we can create objects of any java class present in same p[ackage/folder
        DataTypes dt = new DataTypes();
        ArrayTests at = new ArrayTests();
        ActivatationRecord ar = new ActivatationRecord();
        Test2 t2 = new Test2();

        //Now we are going to create an object of the class which is present ion
        //different package
        //extra work : we must take care of importing the class name via its package details
        Student2 s2 = new Student2();


        //one package can have n number of java classes

        //every possible class would be present inside a folder that folder is called as
        //package in java

        PackageDetails a = new PackageDetails();
        System.out.println(a.getClass().getName());
        //com.trishivax.javarevision.AA
        //combninations of Package name + Class Name
        //com.trishivax.javarevision is the package name
        //AA is class name

    }
}


public class PackageDetails{
    static void main(String[] args) {
        Student s = new Student();
        //when we print object of any java class : Classname@MemoryAddress
        System.out.println(s.name);//we were accessing the variables
        System.out.println(s.course);
        System.out.println(s.rollNo);

        s.code();
        s.read();

    }
}


class Student{

    //if there is nothing written before any member method or variable so there it could be considered as
    //default

    //member variables
    int rollNo = 101;
    String name = "Ram";
    String course = "B.E.";


    //member methods
    public void read(){
        System.out.println("Student can read !");
    }
    public void code(){
        System.out.println("Student can code !");
    }
}




