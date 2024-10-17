import java.io.IOException;
import java.io.*;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {

    double n = 3.14159;
    double r = 0.0;
    Scanner input = new Scanner(System.in);
    
    r = input.nextDouble();
    double result = n*(r*r);
    System.out.println(String.format("A=%.4f", result));

    
    }
 
}