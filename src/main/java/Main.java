import java.awt.*;

public class Main {
    static String name = "Alex";
    //anything within same package level
    public static void main(String[] args) {
        printLength();
    }
    static void printLength(){
        String name ="Alex";
        int length = name.length();
        System.out.println(name+">"+length);




    }



}


