package module10.media;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        double resultado = 0.0;
        int qtdNota = 4;
        Scanner scanner = new Scanner(System.in);




        for (int i = 1; i <= 4; i++) {
            System.out.println("Informe a nota " + i);
            double value = scanner.nextDouble();
            resultado += value;
        }
        double media = resultado/ qtdNota;
        System.out.println("Média: " + verificaMedia(media));
    }

    public static String verificaMedia(double media){
        if(media >= 7){
            return media + " você está APROVADO";
        }

        if (media >= 5){
            return media + " você está RECUPERAÇÂO";
        }
        return media + " você está REPROVADO";
    }

}
