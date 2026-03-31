package com.gla.wrapper;

public class WrapperAutoExample {
    public static void main(String[]args){
        //Autoboxing
        int a=10;

        Integer i=a;//Manual Approach
        //Integer i= Integer.value(a);//Complier will run internally
        System.out.println("value:"+1);

        System.out.println("-------");

        Integer b=120;
        int m=b;//Manual approach
        // int m=b.intvalue();//compiler side
        System.out.println("Unboxing:"+m);


    }

}
