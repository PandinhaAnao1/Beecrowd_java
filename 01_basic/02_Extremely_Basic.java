import java.io.IOException;
import java.io.*;
import java.util.Scanner;  // Import the Scanner class
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        int a = 0;
        int b = 0;
        
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        
        
        System.out.println("X = "+(a+b));
 
    }
 
}