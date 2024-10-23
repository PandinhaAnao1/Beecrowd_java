import java.io.IOException;
import java.io.*;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 0;
        
        a = input.nextInt();
        b = input.nextInt();
        
        int PROD = a * b;
        
        System.out.println("PROD = "+PROD);
 
    }
 
}