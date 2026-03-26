/**
 * @author jawc
 */
package br.com.jawc.ifElse;

import java.util.Scanner;

public class ExampleAge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write your age: ");
        int age = sc.nextInt();
        String ageSt = getAge(age);
        System.out.println(ageSt);
    }

    public static String getAge(int age) {
        if (age >=1  && age <=5){
            return "You are a baby";
        }else if (age >=6 && age <=10){
            return "You are a kid";
        }else if (age >=11 && age <=18){
            return "You are a teenager";
        }else{
            return "You are an adult";
        }
    }
}
