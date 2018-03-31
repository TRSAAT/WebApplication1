/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atul.test;

/**
 *
 * @author ATUL
 */
// POJO
public class Calculator {
    private static int number_1;
    private static int number_2;
    
    public void setNumber_1(int number_1){
        System.out.println("SETTER FOR NUMBER 1.");
        this.number_1=number_1;
        System.out.println("NUMBER 1 IS SETTING...");
    }

    public void setNumber_2(int number_2) {
        System.out.println("SETTER FOR NUMBER 2.");
        this.number_2 = number_2;
        System.out.println("NUMBER 2 IS SETTING...");
    }
    
    public int getNumber_1(){
        System.out.println("RETURNING NUMBER 1.");
        return number_1;
    }
    public int getNumber_2(){
        System.out.println("RETURNING NUMBER 2.");
        return number_2;
    }
}
