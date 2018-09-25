package com.github.netelli;

public class Main {

    public static void main(String[] args)  {
        //Why result is false true ?
        Integer i1 = 128;
        Integer i2 = 128;
        System.out.println(i1 == i2);

        Integer i3 = 127;
        Integer i4 = 127;
        System.out.println(i3 == i4);
    }
}
