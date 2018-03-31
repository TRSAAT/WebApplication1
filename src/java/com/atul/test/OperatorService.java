/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atul.test;
import com.atul.test.Calculator;
import com.atul.test.Input;
/**
 *
 * @author ATUL
 */
public class OperatorService {

    public int sum(){
        int number_1;
        int number_2;
        int result;
        Calculator obj_1=new Calculator();
        number_1=obj_1.getNumber_1();
        System.out.println("NUMBER 1 IS:"+number_1);
        number_2=obj_1.getNumber_2();
        System.out.println("NUMBER 2 IS:"+number_2);
        return result=number_1+number_2;
        
    }
    
    public int mul(){
        int number_1;
        int number_2;
        int result;
        Calculator obj_1=new Calculator();
        number_1=obj_1.getNumber_1();
        System.out.println("NUMBER 1 IS:"+number_1);
        number_2=obj_1.getNumber_2();
        System.out.println("NUMBER 2 IS:"+number_2);
        return result=number_1*number_2;
}
}
