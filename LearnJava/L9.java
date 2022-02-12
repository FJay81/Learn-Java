//Lesson 9

import java.util.Scanner;
public class L9 {
    public static void main(String[] args){
       System.out.println("enter some text");
       Scanner a = new Scanner(System.in);
       String e = a.nextLine();
       System.out.println(e);
       
       System.out.println("enter a interger");
       int y = a.nextInt();//Can be alot of different data types
       System.out.println(y);
       int d = y + 10;
       System.out.println(y + " + 10 = " + d);
    }
}