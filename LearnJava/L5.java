//Lesson 5

import java.util.Scanner; //Imports the libaries needed like in python or other languages

public class L5 {
    public static void main(String[] args){
        System.out.println("Hmmm. What is your name?");
        
        //type identifier = new type();
        Scanner input = new Scanner(System.in);//allows inputs by user//Not static
        //java.util.Scanner inpuwt = new java.util.Scanner(System.in); //Also works but longer
        String name = input.nextLine();//take input from where ever run
        
        System.out.println("hello " + name);//print hello *whatever you inputed*
    }
}