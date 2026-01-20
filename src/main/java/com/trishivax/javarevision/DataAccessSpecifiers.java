package com.trishivax.javarevision;

//Data Encapsulation ---> DataAccess Specifiers-> private Public Protected Default ..
//4 pillers of OOPS: (1) Data Encapsulation ,
// //(2) Abstraction , (3) Inheritence , (4) POlymorphism

public class DataAccessSpecifiers {
    static void main(String[] args) {
        Teacher t = new Teacher();
        System.out.println(t.name);
        System.out.println(t.subject);
        System.out.println(t.mobileNo);
    }
}

