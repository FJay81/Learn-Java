//Lesson 12

import java.util.Scanner;
public class L12 {
    public static void main(String[] args){
        System.out.println(Integer.max(20,15)); //static method//compares ands prints max
        
        Integer a = 5;//instance method
        
        int x = 10;
        int y = 20;
        System.out.println(Integer.compare(x,y));
        
        String money = "300";
        
        System.out.println(Integer.valueOf(money));//returns object
        System.out.println(Integer.parseInt(money));//primitive
        //similar stuff in Double
    }
}