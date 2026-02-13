//Lesson 13

import java.util.Scanner;

public class L13 {
    
    public static void main(String[] args){
        
        String x = "Hello\n\nCats";//easier one//does same thing as buttom one// \n does new line
        String y = new String(" Hi");
        System.out.println(x.charAt(0));//cals first character in variable x
        System.out.println(x + y);
        x += " and people";//adds the text to x value
        System.out.println(x);
        System.out.println(x.length());//shows the number of characters in variable
        System.out.println(x.charAt(0));//shows the character in that space in the string
        System.out.println(x.charAt(x.length() - 1));//this out puts the final char of any string
        String z = x.concat(" and everythng inbetween");//just like += just longer
        System.out.println(z);
        System.out.println(z.contains("Cats"));//returns true or false if string contains what ever is passed here
        System.out.println(z.indexOf("people"));//same as contains just shows where in string it is
        System.out.println(z.lastIndexOf("and"));//same as above but forthe last one of said argument
        String a = "   \n\thellllpppp";
        System.out.println(a.toUpperCase());//turns the entire string uppercase
        //^^also works with ~a.toLowerCase()~ to make all lower case
        System.out.println(a.strip());//remove any white space before string
        //can also use ~a.stripLeading~ for the start or ~a.stripTrailing~ for the end
        System.out.println(z.substring(16));//starts the string from a particular point
        System.out.println(z.substring(16, 22));//starts and ends he part between both parts
        System.out.println(a.toUpperCase().repeat(5));//makes upper and repeat 5x
        System.out.println(z.equals(a));//checks if boths strings are equal outputs true or false
        
        
    } 
}

//join mutiple strings with +
//strings are not primitives
//they are objects
//works similar to variables
//have to use double quotes
//single quotes for different data types
//