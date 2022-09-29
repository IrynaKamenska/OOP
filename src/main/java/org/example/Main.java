package org.example;

import exceptions.MyApplicationException;

public class Main {
    public static void main(String[] args) {
        String text = "ffgfdlkfhjlksdhfg";
        MyService service = new MyService();

        try {
            System.out.println("Text length: "  + service.getTextLength(text));
        } catch (MyApplicationException e) {
            System.out.println("Error occured in get text length: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Unknown Error");
        } finally {
            System.out.println("Finally wird immer ausgeführt");
        }



        try {
            System.out.println(service.getClassByName("java.lang.String").getCanonicalName());
        } catch (MyApplicationException e){
            System.out.println("Error getting Class" + e.getMessage());
            }
        }


    }



