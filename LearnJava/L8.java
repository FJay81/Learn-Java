//Lesson 8

public class L8 {
    public static void main(String[] args){
        
        int x = 5; //whole number 32 bit
        
        double y = 45.988;//can use decimals 64 bit
        
        boolean IsThisUseful = true;//true or false
        
        byte b = 127; //in binary 8 bits can be characters ascii
    
        char c = 'F'; // same as byte but in and 16 bitunicode
        
        short s = -32768; // 16 bit numbers max
        
        long l = 1234567890123456L; //needs L to make 64 bit // 64 bit numbers like int
        
        float f = 20.67f;//32 bit needs f or it'll use double instead
        
        double w =  y / f;//can mix number data types, use double for this as most useful
        
        System.out.println(w);
        
        System.out.println( L7.PI + "\nthat ^(number) was from last lesson (;");
        
    }
}