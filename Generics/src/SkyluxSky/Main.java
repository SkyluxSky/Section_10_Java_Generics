package SkyluxSky;

/*Generics - allow us to create classes, interfaces and methods that take parameters called type parameters. */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Raw Type ArrayList");
        //Raw Type ArrayList - Never use raw types
        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        //items.add("Hello"); //Exception - String cannot be cast to Integer

        printDoubled(items);
        System.out.println("\n");

        System.out.println("ArrayList With Types");
        //Parametized Type - Using Generics
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);


        printDoubled(intList);
    }

    //Doubles output
    //variables of type Object must be casted when used.
    private static void printDoubled(ArrayList n, int x){
        for (Object i : n){
            System.out.println((Integer) i * x); // i  times 2 as and Integer Cast
        }
    }

    //Doubles output
    //Method Overload
    private static void printDoubled(ArrayList<Integer> n){
        for (Integer i : n){
            System.out.println(i * 2); // i  times 2 as and Integer Cast
        }
    }
}
