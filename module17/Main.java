package module17;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Logger.getLogger(module17.Main.class.getName());

    public static void main(String[] args) {
        List<Carro> listaDeCarro = new ArrayList<>();

        listaDeCarro.add(new Carro1("Gol"));
        listaDeCarro.add(new Carro2("Ford"));

        listaDeCarro.forEach(carro -> log.info(carro.toString()));
    }
}
