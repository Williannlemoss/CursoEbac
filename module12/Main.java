package module12;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        parte2();
    }

    private static void parte2() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome-sexo das pessoas separadas por ,");
        String nomes = scanner.nextLine();
        System.out.println("Nomes: " + nomes);
        Stream<Pessoa> listaDePessoas = Arrays.stream(nomes.split(",")).map(Pessoa::new);
        Map<String, List<Pessoa>> mapPessoasPorSexo = listaDePessoas.collect(Collectors.groupingBy(s -> s.sexo));
        System.out.println(mapPessoasPorSexo);
    }


}