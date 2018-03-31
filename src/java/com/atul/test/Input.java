/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atul.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.atul.test.OperatorService;
/**
 *
 * @author ATUL
 */
public class Input extends OperatorService{
    public static void main(String[] args) throws IOException {
        System.out.println("INSIDE MAIN METHOD.");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("OBJECT FOR BUFFERED READER CLASS CREATED.");
        Calculator obj_1=new Calculator();
        System.out.println("OBJECT FOR CALCULATOR CLASS CREATED.");
        System.out.println("ENTER FIRST NUMBER:");
        int number_1=Integer.parseInt(br.readLine());
        obj_1.setNumber_1(number_1);
        System.out.println("NUMBER 1 SET.");
        Calculator obj_2=new Calculator();
        System.out.println("OBJECT FOR CALCULATOR CLASS CREATED.");
        System.out.println("ENTER SECOND NUMBER:");
        int number_2=Integer.parseInt(br.readLine());
        obj_2.setNumber_2(number_2);
        System.out.println("NUMBER 2 SET.");
        System.out.println("Kindly select-OPERATION-");
        Input obj_3=new Input();
        String operation=br.readLine();
        switch (operation){
            case "sum":
                  int a=obj_3.sum();
                  System.out.println("Sum is "+a);
                break;
            case "mul":
                  int b=obj_3.mul();
                  System.out.println("Multiplication is "+b);
                break;
            default:
                System.out.println("Default Case.");
                System.out.println("PROGRAM TERMINATED!");
        }
    }
}