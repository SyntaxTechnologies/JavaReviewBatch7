package com.syntax.class09;

public class ThrowKeyword {
    public static void main(String[] args) {
        print(null);
        print("Kamila");

    }




    public static void print( String name) {

        if(name==null){
            throw  new NullPointerException(" String cannot be null");
        }else {
            System.out.println(name.length());

        }

    }
}
