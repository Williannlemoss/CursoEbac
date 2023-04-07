package module9.casting;

import java.util.Scanner;

/**
 * @author willian.lemos
 *
 * @version 1.0
 */
public class MainCasting {

   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);


       System.out.println("Informe um valor inteiro");
       int value = scanner.nextInt();
       System.out.println("O valor digitado foi " + value);
       Integer casting = Integer.valueOf(value);
       System.out.println("O valor pós casting foi " + value);

   }

}