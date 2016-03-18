package com.epam;

/**
 * Created by m18 on 18.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        MyNumGenerator generator = new MyNumGenerator(5,64);

        System.out.println(generator.generate());

        MyNumGenerator setGenerator = new MyNumGenerator(5,64);

        System.out.println(setGenerator.generateDistinct());
    }
}
