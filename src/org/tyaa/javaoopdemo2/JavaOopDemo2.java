/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javaoopdemo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Yurii
 */
public class JavaOopDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //System.out.println(new MyMethods().firstMethod(2, 2));
        //System.out.println(MyMethods.firstStaticMethod(3, 3));
        
        //1. Strings
        /*List strings = Arrays.asList("A", "B", "Y", "C", "X", "D");
        for (Object string : strings) {
            System.out.println(string);
        }
        //MyMethods.sort(strings);
        MyMethods.sort(
                strings
                , (o1, o2) -> {
                    
                    return o1.toString().compareTo(o2.toString());
                }
        );
        System.out.println("");
        for (Object string : strings) {
            System.out.println(string);
        }*/
        
        //Integers
        /*List numbers = Arrays.asList(5, -7, 1000, 0, 12, 10);
        for (Object string : numbers) {
            System.out.println(string);
        }
        
        MyMethods.sort(
                numbers
                , (o1, o2) -> {
                    
                    return Integer.parseInt(o2.toString()) - Integer.parseInt(o1.toString());
                }
        );
        System.out.println("");
        for (Object string : numbers) {
            System.out.println(string);
        }*/
        
        List persons = Arrays.asList(
                new Person(20, "Vasia")
                , new Person(25, "Masha")
                , new Person(18, "Petia")
        );
        for (Object person : persons) {
            System.out.println(person);
        }
        
        /*MyMethods.sort(
                persons
                , (o1, o2) -> {
                    
                    return ((Person)o1).age - ((Person)o2).age;
                }
        );*/
        MyMethods.sort(
                persons
                , (o1, o2) -> {
                    
                    return ((Person)o1).age - ((Person)o2).age;
                }
                , MyMethods.Direction.Reverse
        );
        System.out.println("");
        for (Object person : persons) {
            System.out.println(person);
        }
    }
    
}
