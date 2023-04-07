package Module11;

import java.util.*;
import java.util.stream.Collector;
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