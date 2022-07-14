/**
 * @author willian.lemos
 *
 * @version 1.0
 */
public class Main {

    private static float nota1;
    private static float nota2;
    private static float nota3;
    private static float nota4;

   public static void main(String[] args){
        nota1 = 7.0f;
        nota2 = 8.0f;
        nota3 = 6.0f;
        nota4 = 7.0f;
        float media = media(nota1, nota2, nota3, nota4);
        System.out.println("media  = " + media);
   }

   public static float media(float nota1, float nota2, float nota3, float nota4){
        return (nota1 + nota2 + nota3 + nota4) /4;
   }
}