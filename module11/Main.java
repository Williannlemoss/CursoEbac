package module11;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        parte1();
        parte2();
    }

    private static void parte1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome das pessoas separadas por ,");
        String nomes = scanner.nextLine();
        System.out.println("Nomes: " + nomes);
        List<String> listaDeNomes = Arrays.asList(nomes.split(","));
        Collections.sort(listaDeNomes);
        System.out.println(listaDeNomes);
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