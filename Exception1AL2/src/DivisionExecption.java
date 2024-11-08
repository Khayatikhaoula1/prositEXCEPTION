
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author USER
 */


public class DivisionExecption {


    static int x = 20;
    static int y;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       try {
           System.out.println(" Enter un entier");
           y = scanner.nextInt();
           System.out.println(x / y);
          // System.out.println("close");
       }catch (ArithmeticException e) {
           System.out.println(e);
           //System.out.println("close");
       }catch (InputMismatchException e)
       {
           System.out.println(e);
         //  System.out.println("close");
       }finally {
           System.out.println("close");
       }
    }


}
