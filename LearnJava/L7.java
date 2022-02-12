//Lesson 7
public class L7 extends L1 {
    public static final double PI = 3.14159;//global variable
    public static void main(String[] args){
        int x = 5; //primitive type // 2 step process
        Integer y = 5; //object (auto boxing)
        String string = "5";
        System.out.println(x + y + string);
        int a;//step 1//depends where you gonna use
        a = 7;//step 2//doing like this allows if needed later 
        a = 9;//reassign a
        final int Q = 1;//is constant cant be changed
    }
}
//variable creation - declare it - initialize it
//primitive types
//objects - instance of class
//class - data type
//data type - the type of data. how pc interprets data
//statically typedd - all data types upfront
//dynamically typed - variables do not have types